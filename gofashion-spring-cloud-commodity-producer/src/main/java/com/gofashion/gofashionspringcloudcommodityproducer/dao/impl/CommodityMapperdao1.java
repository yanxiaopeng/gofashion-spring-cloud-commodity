package com.gofashion.gofashionspringcloudcommodityproducer.dao.impl;

import com.gofashion.gofashionspringcloudcommodityproducer.dao.CommodityShowSolr;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsModel;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsSearch;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * solr展示加高亮
 */
@Repository
public class CommodityMapperdao1 implements CommodityShowSolr {

    private static final String solrUrl = "http://localhost:8983/solr/core1";

    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client = new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();

    @Override
    public List<GoodsModel> searchProduct(GoodsSearch goodsSearch) throws Exception {

        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(goodsSearch.getQueryString());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        if (null != goodsSearch.getCatalog_name() && !"".equals(goodsSearch.getCatalog_name())) {
            solrQuery.set("fq", "gskuspec_name:" + goodsSearch.getCatalog_name());
        }
        if (null != goodsSearch.getPrice() && !"".equals(goodsSearch.getPrice())) {
            //0-99   500-*  对价格进行过滤
            String[] p = goodsSearch.getPrice().split("-");
            solrQuery.set("fq", "gskuspec_price:[" + p[0] + " TO " + p[1] + "]");
        }
        // 价格排序
        if ("1".equals(goodsSearch.getSort())) {
            solrQuery.addSort("gskuspec_price", SolrQuery.ORDER.desc);
        } else {
            solrQuery.addSort("gskuspec_price", SolrQuery.ORDER.asc);
        }
        // 分页
        solrQuery.setStart(0);//第几行开始
        solrQuery.setRows(10);//一页显示多少行
        // 只查询指定域
        solrQuery.set("fl", "id,gskuspec_headline,gskuspec_name,gspubrand_picture,gspsecondgrade_name,gspufirstgrade_name,gspubrand_name,gskuspec_price");
        // 高亮
        // 打开开关
        solrQuery.setHighlight(true);
        // 指定高亮域

        solrQuery.addHighlightField("gskuspec_headline");
        solrQuery.addHighlightField("gskuspec_name");
        solrQuery.addHighlightField("gspufirstgrade_name");
        solrQuery.addHighlightField("gspsecondgrade_name");
        solrQuery.addHighlightField("gspubrand_name");

        // 前缀
        solrQuery.setHighlightSimplePre("<span style='color:red'>");
        solrQuery.setHighlightSimplePost("</span>");
        // 执行查询
        QueryResponse response = client.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
        List<GoodsModel> goodsModels = new ArrayList<GoodsModel>();
        for (SolrDocument doc : docs) {
            GoodsModel productModel = new GoodsModel();
            productModel.setId((String) doc.get("id"));
            productModel.setGskuspec_price((String) doc.get("gskuspec_price"));
            productModel.setGspubrand_picture((String) doc.get("gspubrand_picture"));
            productModel.setGspubrand_picture((String) doc.get("gskuspec_headline"));

            Map<String, List<String>> map = highlighting.get((String) doc.get("id"));
            List<String> list1 = map.get("gskuspec_name");
            List<String> list2 = map.get("gspufirstgrade_name");
            List<String> list3 = map.get("gspsecondgrade_name");
            List<String> list4 = map.get("gspubrand_name");
            List<String> list5 = map.get("gskuspec_headline");


            if (list1 != null) {
                productModel.setGskuspec_name(list1.get(0));
            } else {
                productModel.setGskuspec_name((String) doc.get("gskuspec_name"));
            }
            if (list2 != null) {
                productModel.setGspufirstgrade_name(list2.get(0));
            } else {
                productModel.setGspufirstgrade_name((String) doc.get("gspufirstgrade_name"));
            }


            if (list3 != null) {
                productModel.setGspsecondgrade_name(list3.get(0));
            } else {
                productModel.setGspsecondgrade_name((String) doc.get("gspsecondgrade_name"));
            }
            if (list4 != null) {
                productModel.setGspubrand_name(list4.get(0));
            } else {
                productModel.setGspubrand_name((String) doc.get("gspubrand_name"));
            }

            if (list5 != null) {
                productModel.setGspubrand_name(list5.get(0));
            } else {
                productModel.setGspubrand_name((String) doc.get("gskuspec_headline"));
            }

            goodsModels.add(productModel);
        }
        return goodsModels;
    }
}

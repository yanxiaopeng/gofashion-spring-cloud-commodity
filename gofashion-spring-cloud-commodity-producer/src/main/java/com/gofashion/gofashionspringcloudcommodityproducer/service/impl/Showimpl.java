package com.gofashion.gofashionspringcloudcommodityproducer.service.impl;


import com.gofashion.gofashionspringcloudcommodityproducer.dao.CommodityMapper;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsModel;
import com.gofashion.gofashionspringcloudcommodityproducer.service.CommodityShowservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * 添加索引库
 */
@Service
public class Showimpl implements CommodityShowservice {

    @Autowired
    private CommodityMapper mm;
    //solr
    private static final String solrUrl="http://localhost:8983/solr/core1";

    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    //日志
    private Logger logger = LoggerFactory.getLogger(Showimpl.class);
    private int a = 0;
    private int b = 0;

    @Override
    @Scheduled(fixedRate = 10000)//5秒  initialDelay 程序启动后延迟
    public String upsolr() throws IOException, SolrServerException {
        List<GoodsModel> all = mm.all();
        for (GoodsModel uo : all ) {
            SolrInputDocument document = new SolrInputDocument();
            document.addField("id", uo.getId());
            document.addField("gskuspec_name", uo.getGskuspec_name());
            document.addField("gskuspec_headline", uo.getGskuspec_headline());
            document.addField("gspubrand_picture", uo.getGspubrand_picture());
            document.addField("gspsecondgrade_name", uo.getGspsecondgrade_name());
            document.addField("gspubrand_name", uo.getGspubrand_name());
            document.addField("gspufirstgrade_name", uo.getGspufirstgrade_name());
            document.addField("gskuspec_price", uo.getGskuspec_price());
            client.add(document);
        }
        client.commit();
        logger.info("===fixedDelay: 第{}次执行方法", a++);
        return "导入成功!";
    }
    @Scheduled(fixedRate = 10000)
    public String aa(){
        logger.info("===fixedDelay: 第{}次执行方法", b++);
        return "0";
    }
}

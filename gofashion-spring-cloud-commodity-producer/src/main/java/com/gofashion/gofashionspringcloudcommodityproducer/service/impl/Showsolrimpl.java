package com.gofashion.gofashionspringcloudcommodityproducer.service.impl;

import com.alibaba.fastjson.JSON;
import com.gofashion.gofashionspringcloudcommodityproducer.dao.impl.CommodityMapperdao1;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsModel;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsSearch;
import com.gofashion.gofashionspringcloudcommodityproducer.service.CommodityShowservicesolr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 查询条件
 */
@Service
public class Showsolrimpl implements CommodityShowservicesolr {
    @Autowired
    private CommodityMapperdao1 showSolr1;

    @Override
    public String  searchProduct(GoodsSearch messageSolrd) throws Exception {
        String x = "";
        if (messageSolrd == null){
            messageSolrd.setQueryString("小米");
            List<GoodsModel> xx = showSolr1.searchProduct(messageSolrd);
            if (xx != null){
               x = JSON.toJSONString(showSolr1.searchProduct(messageSolrd));
            }else{
                x = "网络异常";
            }
        }else{
          List<GoodsModel> xx = showSolr1.searchProduct(messageSolrd);
            if (xx != null){
                x = JSON.toJSONString(showSolr1.searchProduct(messageSolrd));
            }else{
                x = "网络异常";
            }
        }


        return x;
    }
}

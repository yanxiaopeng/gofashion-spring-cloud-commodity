package com.gofashion.gofashionspringcloudcommodityconsumer.feign.impl;

import com.gofashion.gofashionspringcloudcommodityconsumer.feign.CommodityShowservice;
import com.gofashion.gofashionspringcloudcommodityconsumer.feign.CommodityShowservicesolr;
import com.gofashion.gofashionspringcloudcommodityconsumer.feign.DescriptionService;
import com.gofashion.gofashionspringcloudcommodityconsumer.feign.UpdInventoryService;
import com.gofashion.gofashionspringcloudcommodityconsumer.pojo.GoodsSearch;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignClientFallBack implements CommodityShowservicesolr,CommodityShowservice,DescriptionService,UpdInventoryService {
    @Override
    public String upsolr() {
        return "网络错误";
    }


    @Override
    public String all(Integer id) {
        return "网络错误";
    }


    @Override
    public String searchProduct(GoodsSearch messageSolrd) {
        return "网络错误";
    }

    @Override
    public String updzInventoryService(Integer number, Integer goodsskuabvid) {
        return "网络错误";
    }

    @Override
    public String updfInventoryService(Integer number, Integer goodsskuabvid) {
        return "网络错误";
    }
}

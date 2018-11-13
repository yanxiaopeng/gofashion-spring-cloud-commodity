package com.gofashion.gofashionspringcloudcommodityconsumer.contorller;

import com.gofashion.gofashionspringcloudcommodityconsumer.feign.CommodityShowservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 更新solr index
 */
@RestController
public class ShowController {
    @Autowired
    private CommodityShowservice showservice;

    public CommodityShowservice getShowservice() {
        return showservice;
    }

    public void setShowservice(CommodityShowservice showservice) {
        this.showservice = showservice;
    }

    @RequestMapping(value = "solr")
    public String upsolr(){
        String upsolr = showservice.upsolr();
        return upsolr;
    }
}

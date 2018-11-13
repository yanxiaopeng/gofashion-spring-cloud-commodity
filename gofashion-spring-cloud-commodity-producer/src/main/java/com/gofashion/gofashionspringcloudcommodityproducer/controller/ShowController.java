package com.gofashion.gofashionspringcloudcommodityproducer.controller;

import com.gofashion.gofashionspringcloudcommodityproducer.service.CommodityShowservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

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


    @RequestMapping(value = "solr",method = RequestMethod.GET)
    public String upsolr() throws IOException, SolrServerException {
        String upsolr = showservice.upsolr();
        return upsolr;
    }
}

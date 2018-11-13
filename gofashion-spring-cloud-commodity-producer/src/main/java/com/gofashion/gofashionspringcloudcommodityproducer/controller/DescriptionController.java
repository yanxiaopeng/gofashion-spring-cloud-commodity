package com.gofashion.gofashionspringcloudcommodityproducer.controller;

import com.alibaba.fastjson.JSON;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.DescriptionModel;
import com.gofashion.gofashionspringcloudcommodityproducer.service.impl.DescriptionServiceImpl;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.io.IOException;

/**
 * 查详情
 */
@RestController
public class DescriptionController {
    @Autowired
    private DescriptionServiceImpl  descriptionService;

    public DescriptionServiceImpl getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(DescriptionServiceImpl descriptionService) {
        this.descriptionService = descriptionService;
    }


    @RequestMapping(value = "details",method = RequestMethod.GET)
    public String details(@RequestParam("id")Integer id) throws IOException, SolrServerException {
       String descriptionModel = descriptionService.all(id);
        return descriptionModel;
    }
}

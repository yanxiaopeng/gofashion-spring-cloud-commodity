package com.gofashion.gofashionspringcloudcommodityproducer.controller;

import com.alibaba.fastjson.JSON;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsModel;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsSearch;
import com.gofashion.gofashionspringcloudcommodityproducer.service.impl.Showsolrimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *展示页面
 */
@RestController
public class ShowsolrController {
    @Autowired
    private Showsolrimpl showsolrimpl;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String searchProduct( GoodsSearch messageSolrd) throws Exception {
        System.out.println(messageSolrd.getQueryString());
        //获取到检索的所有结果
        String searchProducts = showsolrimpl.searchProduct(messageSolrd);
        return searchProducts ;
    }
}

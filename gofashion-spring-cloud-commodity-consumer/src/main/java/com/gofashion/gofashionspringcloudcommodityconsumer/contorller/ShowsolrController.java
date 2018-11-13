package com.gofashion.gofashionspringcloudcommodityconsumer.contorller;

import com.gofashion.gofashionspringcloudcommodityconsumer.feign.CommodityShowservicesolr;
import com.gofashion.gofashionspringcloudcommodityconsumer.pojo.GoodsSearch;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *展示页面
 */
@RestController
public class ShowsolrController {
    @Autowired
    private CommodityShowservicesolr showsolrimpl;
    @RequestMapping(value = "list")
    public String searchProduct(GoodsSearch messageSolrd){
        //获取到检索的所有结果
        String searchProducts = showsolrimpl.searchProduct(messageSolrd);
        //设置回显内容
//        model.addAttribute("productModels", searchProducts);
//        model.addAttribute("queryString", messageSolrd.getQueryString());
//        model.addAttribute("catalog_name", messageSolrd.getCatalog_name());
//        model.addAttribute("price", messageSolrd.getPrice());
//        model.addAttribute("sort", messageSolrd.getSort());
//        model.addAttribute("type", messageSolrd.getType());
//        return "product_list";
        return  searchProducts;
    }
}

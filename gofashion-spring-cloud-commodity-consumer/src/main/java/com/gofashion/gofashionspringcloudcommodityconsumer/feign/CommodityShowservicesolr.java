package com.gofashion.gofashionspringcloudcommodityconsumer.feign;


import com.gofashion.gofashionspringcloudcommodityconsumer.feign.impl.FeignClientFallBack;
import com.gofashion.gofashionspringcloudcommodityconsumer.pojo.GoodsModel;
import com.gofashion.gofashionspringcloudcommodityconsumer.pojo.GoodsSearch;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "gofashion-cloud-commodity-producer", fallback = FeignClientFallBack.class)
public interface CommodityShowservicesolr {
    @RequestMapping(value = "list", method = RequestMethod.GET)
   String searchProduct(GoodsSearch messageSolrd);
}

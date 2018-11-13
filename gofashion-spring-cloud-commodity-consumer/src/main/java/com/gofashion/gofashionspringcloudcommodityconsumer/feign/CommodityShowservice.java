package com.gofashion.gofashionspringcloudcommodityconsumer.feign;

import com.gofashion.gofashionspringcloudcommodityconsumer.feign.impl.FeignClientFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "gofashion-cloud-commodity-producer", fallback = FeignClientFallBack.class)
public interface CommodityShowservice {
    //solr更新数据
    @RequestMapping(value = "solr", method = RequestMethod.GET)
    String upsolr();
}

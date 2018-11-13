package com.gofashion.gofashionspringcloudcommodityconsumer.feign;

import com.gofashion.gofashionspringcloudcommodityconsumer.feign.impl.FeignClientFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "gofashion-cloud-commodity-producer", fallback = FeignClientFallBack.class)
public interface UpdInventoryService {
    @RequestMapping(value = "updftory", method = RequestMethod.GET)
    String updzInventoryService(@RequestParam("number") Integer number, @RequestParam("goodsskuabvid") Integer goodsskuabvid);
    @RequestMapping(value = "upzdtory", method = RequestMethod.GET)
    String updfInventoryService(@RequestParam("number") Integer number, @RequestParam("goodsskuabvid") Integer goodsskuabvid);
}

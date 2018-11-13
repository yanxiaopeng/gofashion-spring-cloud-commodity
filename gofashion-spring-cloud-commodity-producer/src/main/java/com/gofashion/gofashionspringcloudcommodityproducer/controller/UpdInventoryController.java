package com.gofashion.gofashionspringcloudcommodityproducer.controller;

import com.gofashion.gofashionspringcloudcommodityproducer.service.UpdInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 加减库存
 */
@RestController
public class UpdInventoryController {
    @Autowired
    private UpdInventoryService updInventoryService;

    public UpdInventoryService getUpdInventoryService() {
        return updInventoryService;
    }

    public void setUpdInventoryService(UpdInventoryService updInventoryService) {
        this.updInventoryService = updInventoryService;
    }

    /**
     * 减库存
     * @param number
     * @param goodsskuabvid
     * @param
     * @return
     */

    @RequestMapping(value = "updftory",method = RequestMethod.GET)
    public  String updftory(@RequestParam( "number") Integer number, @RequestParam(name = "goodsskuabvid") Integer goodsskuabvid){
    String updateInventoryService =updInventoryService.updfInventoryService(number,goodsskuabvid);
       return updateInventoryService;
    }

    @RequestMapping(value = "upzdtory",method = RequestMethod.GET)
    public  String updztory(@RequestParam( "number") Integer number, @RequestParam(name = "goodsskuabvid") Integer goodsskuabvid){
        String updateInventoryService =updInventoryService.updzInventoryService(number,goodsskuabvid);
        return updateInventoryService;
    }

}

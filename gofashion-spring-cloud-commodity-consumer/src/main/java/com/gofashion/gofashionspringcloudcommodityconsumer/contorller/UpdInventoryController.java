package com.gofashion.gofashionspringcloudcommodityconsumer.contorller;

import com.gofashion.gofashionspringcloudcommodityconsumer.feign.UpdInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
     * @param model
     * @return
     */
    @RequestMapping(value = "updftory")
    public  String updftory(@RequestParam( "number") Integer number, @RequestParam("goodsskuabvid") Integer goodsskuabvid, Model model){
    String updateInventoryService =updInventoryService.updfInventoryService(number,goodsskuabvid);
     model.addAttribute("updatefInventoryService",updateInventoryService);
       return updateInventoryService;
    }

    @RequestMapping(value = "upzdtory")
    public  String updztory(@RequestParam("number") Integer number, @RequestParam( "goodsskuabvid") Integer goodsskuabvid, Model model){
        String updateInventoryService =updInventoryService.updzInventoryService(number,goodsskuabvid);
        model.addAttribute("updatezInventoryService",updateInventoryService);
        return "订单超时页面";
    }

}

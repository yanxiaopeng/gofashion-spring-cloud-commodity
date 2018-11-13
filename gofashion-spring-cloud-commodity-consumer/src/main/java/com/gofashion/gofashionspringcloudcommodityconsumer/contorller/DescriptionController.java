package com.gofashion.gofashionspringcloudcommodityconsumer.contorller;

import com.gofashion.gofashionspringcloudcommodityconsumer.feign.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 查详情
 */
@RestController
public class DescriptionController {
    @Autowired
    private DescriptionService descriptionService;

    public DescriptionService getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(DescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }

    @RequestMapping(value = "details",method = RequestMethod.GET)
    public String details(@RequestParam("id")Integer id){
        String DescriptionModel =descriptionService.all(id);
        return  DescriptionModel;
    }
}

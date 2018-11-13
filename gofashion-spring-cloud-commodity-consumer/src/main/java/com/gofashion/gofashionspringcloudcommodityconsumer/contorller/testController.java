package com.gofashion.gofashionspringcloudcommodityconsumer.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * 更新solr index
 */
@RestController
public class testController {
    @RequestMapping(value = "so",method = RequestMethod.GET)
    public String upsolr(@RequestParam("upsolr") String upsolr){
        System.out.println(upsolr);
        return "NIHAO";
    }
}

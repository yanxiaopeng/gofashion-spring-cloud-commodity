package com.gofashion.gofashionspringcloudcommodityproducer.service.impl;


import com.alibaba.fastjson.JSON;
import com.gofashion.gofashionspringcloudcommodityproducer.dao.CommodityMapper;
import com.gofashion.gofashionspringcloudcommodityproducer.dao.DescriptionMapper;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.DescriptionModel;
import com.gofashion.gofashionspringcloudcommodityproducer.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 查询单个商品信息
 */

@Service
public class DescriptionServiceImpl implements DescriptionService {
    @Autowired
    private DescriptionMapper   descriptionMapper;

    public DescriptionMapper getDescriptionMapper() {
        return descriptionMapper;
    }

    public void setDescriptionMapper(DescriptionMapper descriptionMapper) {
        this.descriptionMapper = descriptionMapper;
    }

    @Override
    public String all(Integer id) {
        String x = "";
        if (id < 1){
            x = "您所搜索的商品不存在";
        }else{
            if (descriptionMapper.all(id) == null){
                x ="您搜索的商品已下架";
            } else if (descriptionMapper.all(id).getGoodsskuabv_inventory()<1){
                x= "您搜索的商品已售罄";
            }else{
                x = JSON.toJSONString( descriptionMapper.all(id));
            }
        }
        return  x ;
    }
}

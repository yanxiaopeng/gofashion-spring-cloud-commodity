package com.gofashion.gofashionspringcloudcommodityproducer.service;


import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsModel;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsSearch;

import java.util.List;

public interface CommodityShowservicesolr {
    public String searchProduct(GoodsSearch messageSolrd) throws Exception;
}

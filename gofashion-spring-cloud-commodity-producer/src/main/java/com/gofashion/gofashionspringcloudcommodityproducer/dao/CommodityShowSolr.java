package com.gofashion.gofashionspringcloudcommodityproducer.dao;

import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsModel;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsSearch;

import java.util.List;

/**
 * solr展示
 */
public interface CommodityShowSolr {
    List<GoodsModel> searchProduct(GoodsSearch goodsSearch) throws Exception;
}

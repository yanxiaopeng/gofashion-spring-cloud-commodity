package com.gofashion.gofashionspringcloudcommodityproducer.dao;

import com.gofashion.gofashionspringcloudcommodityproducer.pojo.DescriptionModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 查单条库存
 */
@Mapper
@Repository
public interface SelInventoryMapper {
    @Select("SELECT goodsskuabv_inventory FROM gs_gskuspecvalue WHERE goodsskuabv_id= #{goodsskuabvid}")
    DescriptionModel selInventory(@Param(value = "goodsskuabvid") int goodsskuabvid);
}

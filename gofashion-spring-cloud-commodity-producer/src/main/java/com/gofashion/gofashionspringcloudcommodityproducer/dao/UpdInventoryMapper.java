package com.gofashion.gofashionspringcloudcommodityproducer.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * 修改库存
 */
@Mapper
@Repository
public interface UpdInventoryMapper {
    @Update("UPDATE gs_gskuspecvalue SET  goodsskuabv_inventory=#{number} WHERE goodsskuabv_id = #{goodsskuabvid} ")
    int updateInventory(@Param(value = "number") int number,@Param(value = "goodsskuabvid")int goodsskuabvid);
}

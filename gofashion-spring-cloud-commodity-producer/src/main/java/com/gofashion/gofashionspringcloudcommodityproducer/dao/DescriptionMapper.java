package com.gofashion.gofashionspringcloudcommodityproducer.dao;

import com.gofashion.gofashionspringcloudcommodityproducer.pojo.DescriptionModel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * 查商品详情
 */
@Mapper
@Repository
public interface DescriptionMapper {


    @Select("SELECT gb.gsseller_id, gb.gsseller_name,gb.gsseller_address,sg.goodsskuabv_id,sg.goodsskuabv_screensize,sg.goodsskuabv_resolutionratio,sg.goodsskuabv_typetv,sg.goodsskuabv_picture,sg.goodsskuabv_price,sg.goodsskuabv_inventory,ss.gskuspec_headline FROM gs_gskuspec ss LEFT JOIN gs_gskuspecvalue sg ON ss.gskuspec_specvalueid = sg.goodsskuabv_id LEFT JOIN gs_gsseller gb ON ss.gskuspec_goodssellerid = gb.gsseller_id WHERE ss.gskuspec_id = #{id}")
    @Results({
            @Result(property = "gsseller_id", column = "gsseller_id"),
            @Result(property = "gsseller_name", column = "gsseller_name"),
            @Result(property = "gsseller_address", column = "gsseller_address"),
            @Result(property = "goodsskuabv_id", column = "goodsskuabv_id"),
            @Result(property = "goodsskuabv_screensize", column = "goodsskuabv_screensize"),
            @Result(property = "goodsskuabv_resolutionratio", column = "goodsskuabv_resolutionratio"),
            @Result(property = "goodsskuabv_typetv", column = "goodsskuabv_typetv"),
            @Result(property = "goodsskuabv_picture", column = "goodsskuabv_picture"),
            @Result(property = "goodsskuabv_price", column = "goodsskuabv_price"),
            @Result(property = "goodsskuabv_inventory", column = "goodsskuabv_inventory"),
            @Result(property = "gskuspec_headline", column = "gskuspec_headline"),

    })
    DescriptionModel all(@Param("id")Integer id );
}

package com.gofashion.gofashionspringcloudcommodityproducer.dao;

import com.gofashion.gofashionspringcloudcommodityproducer.pojo.GoodsModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 查全部
 */
@Mapper
@Repository
public interface CommodityMapper {
    @Select(" SELECT ss.gskuspec_id,ss.gskuspec_headline,ss.gskuspec_name,ss.gskuspec_price,sg.gspsecondgrade_name,gb.gspubrand_name,gb.gspubrand_picture,gf.gspufirstgrade_name FROM gs_gskuspec ss LEFT JOIN gs_gspsecondgrade sg ON ss.gskuspec_secondgradeid=sg.gspsecondgrade_id  LEFT JOIN gs_gspubrand gb ON ss.gskuspec_brandid = gb.gspubrand_id LEFT JOIN gs_gspufirstgrade gf ON ss.gskuspec_firstgradeid = gf.gspufirstgrade_id")
    @Results({
            @Result(property = "id", column = "gskuspec_id"),
            @Result(property = "gskuspec_headline", column = "gskuspec_headline"),
            @Result(property = "gskuspec_name", column = "gskuspec_name"),
            @Result(property = "gskuspec_price", column = "gskuspec_price"),
            @Result(property = "gspsecondgrade_name", column = "gspsecondgrade_name"),
            @Result(property = "gspubrand_name", column = "gspubrand_name"),
            @Result(property = "gspubrand_picture", column = "gspubrand_picture"),
            @Result(property = "gspufirstgrade_name", column = "gspufirstgrade_name")})

    List<GoodsModel> all();
}
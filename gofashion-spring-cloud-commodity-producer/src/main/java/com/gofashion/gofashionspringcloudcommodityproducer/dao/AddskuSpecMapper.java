package com.gofashion.gofashionspringcloudcommodityproducer.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AddskuSpecMapper {
    @Insert("")
    int addskuSpec();
}

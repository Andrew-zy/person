package com.aaa.dao;

import com.aaa.entity.area_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface area_infoDao {
    @Select("select * from area_info")
    List<area_info> findAll();


}

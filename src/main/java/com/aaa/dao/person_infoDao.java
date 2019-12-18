package com.aaa.dao;


import com.aaa.entity.person_info;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface person_infoDao {

    @Select("select p.person_id,p.person_name,a.area_name,p.person_age,p.person_address from person_info p join area_info a on p.person_area_id=a.area_id")
    List<Map<String,Object>> findAll();

    @Insert("insert into person_info(person_name,person_area_id,person_age,person_address) values(#{person_name},#{person_area_id},#{person_age},#{person_address})")
    int add(person_info person_info);

    @Select("select p.person_id,p.person_name,a.area_name,p.person_age,p.person_address from person_info p join area_info a on p.person_area_id=a.area_id where p.person_id=#{param1}")
    Map<String,Object> findOne(Integer person_id);

    @Update("update person_info set person_name=#{person_name},person_area_id=#{person_area_id},person_age=#{person_age},person_address=#{person_address} where person_id=#{person_id}")
    int upda(person_info person_info);

}

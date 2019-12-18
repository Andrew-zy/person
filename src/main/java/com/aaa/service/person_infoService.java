package com.aaa.service;


import com.aaa.dao.person_infoDao;
import com.aaa.entity.person_info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class person_infoService {

    @Resource
    person_infoDao person_infoDao;

    public List<Map<String,Object>> findAll(){
        return person_infoDao.findAll();
    }

    public int add(person_info person_info){
        return person_infoDao.add(person_info);
    }

    public Map<String,Object> findOne(Integer person_id){
        return person_infoDao.findOne(person_id);
    }

    public int upde(person_info person_info){
        return person_infoDao.upda(person_info);
    }

}

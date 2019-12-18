package com.aaa.service;


import com.aaa.dao.area_infoDao;
import com.aaa.entity.area_info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class area_infoService {

    @Resource
    area_infoDao area_infoDao;


    public List<area_info> findAll(){
        return area_infoDao.findAll();
    }


}

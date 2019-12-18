package com.aaa.controller;

import com.aaa.entity.area_info;
import com.aaa.entity.person_info;
import com.aaa.service.area_infoService;
import com.aaa.service.person_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class person_infoController {

    @Resource
    person_infoService person_infoService;

    @Resource
    area_infoService area_infoService;


    @RequestMapping("findAll")
    public String findAll(HttpSession session){
        List<Map<String, Object>> all = person_infoService.findAll();
        System.out.println(all);
        session.setAttribute("finds",all);
        System.out.println(session.getAttribute("finds"));
        return "show";
    }

    @RequestMapping("add")
    public String add(HttpSession session){
        List<area_info> all = area_infoService.findAll();
        session.setAttribute("sele",all);
        System.out.println(session.getAttribute("sele"));
        return "add";
    }

    @RequestMapping("adds")
    public String adds(person_info person_info){
        int add = person_infoService.add(person_info);
        System.out.println(add);
        return "redirect:findAll";
    }

    @RequestMapping("one")
    public String adds(Integer person_infoId,HttpSession session){
        Map<String, Object> one = person_infoService.findOne(person_infoId);
        List<area_info> all = area_infoService.findAll();
        session.setAttribute("sele",all);
        System.out.println(session.getAttribute("sele"));
        session.setAttribute("one",one);
        return "upd";
    }


    @RequestMapping("upde")
    public String upde(person_info person_info){
        person_infoService.upde(person_info);
        System.out.println(person_info);
        return "redirect:findAll";
    }







}

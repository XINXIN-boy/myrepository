package com.itqf.demo04.controller;

import com.itqf.demo04.entity.Commodity;
import com.itqf.demo04.entity.VoCommodity;
import com.itqf.demo04.service.CommoditySevice;
import com.itqf.demo04.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2316:18
 * description:
 */
@Controller
public class CommodityController {
    @Autowired
    CommoditySevice commodityService ;

    @RequestMapping("/find.do")
    @ResponseBody
    public Map<String ,Object> find(){
        Map<String, Object> map = new HashMap<>();

       List<Commodity> list =  commodityService.findall();
        map.put("code" , 0 ) ;
        map.put("data" , list) ;

        return map ;
    }
    @RequestMapping("/query.do")
    @ResponseBody
    public Map<String ,Object> query(){
        Map<String, Object> map = new HashMap<>();

        List<VoCommodity> list =  commodityService.queryall();
        map.put("code" , 0 ) ;
        map.put("data" , list) ;

        return map ;
    }



}

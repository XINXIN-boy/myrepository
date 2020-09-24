package com.itqf.demo04.service;

import com.itqf.demo04.entity.Commodity;
import com.itqf.demo04.entity.VoCommodity;

import java.util.List;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2316:19
 * description:
 */
public interface CommoditySevice {
    List<Commodity> findall();
    List<VoCommodity> queryall() ;
}

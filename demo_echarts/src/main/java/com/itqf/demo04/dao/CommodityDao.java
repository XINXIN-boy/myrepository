package com.itqf.demo04.dao;

import com.itqf.demo04.entity.Commodity;

import java.util.List;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2316:19
 * description:
 */

public interface CommodityDao {
    List<Commodity> findAll() ;
}

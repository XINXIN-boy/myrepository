package com.itqf.demo04.service.impl;

import com.itqf.demo04.dao.CommodityDao;
import com.itqf.demo04.entity.Commodity;
import com.itqf.demo04.entity.VoCommodity;
import com.itqf.demo04.service.CommoditySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2316:19
 * description:
 */
@Service
public class CommodityServiceImpl implements CommoditySevice {

    @Autowired
    CommodityDao commodityDao ;

    @Override
    public List<Commodity> findall() {
        List<Commodity> all = commodityDao.findAll();
        return all;
    }

    @Override
    public List<VoCommodity> queryall() {
        List<Commodity> all = commodityDao.findAll();

        List<VoCommodity> list = new ArrayList<>();

        for (Commodity commodity : all) {
            VoCommodity voCommodity = new VoCommodity();
            voCommodity.setName(commodity.getName());
            voCommodity.setValue(commodity.getNumber());
            list.add(voCommodity) ;
        }

        return list;
    }
}

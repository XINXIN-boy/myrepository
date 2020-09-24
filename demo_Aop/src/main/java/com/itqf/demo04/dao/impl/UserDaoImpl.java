package com.itqf.demo04.dao.impl;

import com.itqf.demo04.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/1415:36
 * description:
 */

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int uid) {
        System.out.println("执行add");
//        int a = 9/0 ;
        return uid;
    }
}

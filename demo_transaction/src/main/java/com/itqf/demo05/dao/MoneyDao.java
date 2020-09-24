package com.itqf.demo05.dao;

import com.itqf.demo05.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2320:48
 * description:
 */
public interface MoneyDao {
    int add(User user);
    int subtract(User user);
}

package com.itqf.demo05.service.impl;

import com.itqf.demo05.dao.MoneyDao;
import com.itqf.demo05.entity.User;
import com.itqf.demo05.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2320:47
 * description:
 */
@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    MoneyDao moneyDao ;

    @Override
    public void transfer(String account1 , String account2 ,double money){

        System.out.println("减");
        User user = new User(account1, money);
        int update1 = moneyDao.subtract(user);
        System.out.println("减之后");
        int a = 9/ 0;

        System.out.println("加");
        User user1 = new User(account2, money);
        int update = moneyDao.add(user1);

    }

}

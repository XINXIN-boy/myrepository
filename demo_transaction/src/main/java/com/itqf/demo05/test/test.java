package com.itqf.demo05.test;

import com.itqf.demo05.dao.MoneyDao;
import com.itqf.demo05.service.MoneyService;
import com.itqf.demo05.service.impl.MoneyServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/2321:16
 * description:
 */
public class test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MoneyService moneyServiceImpl = (MoneyService) classPathXmlApplicationContext.getBean("moneyServiceImpl");
        moneyServiceImpl.transfer("admin" , "xinxin" , 100);

        System.out.println("ok");

    }
}

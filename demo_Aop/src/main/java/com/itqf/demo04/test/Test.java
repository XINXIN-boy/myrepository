package com.itqf.demo04.test;

import com.itqf.demo04.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/1415:49
 * description:
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDaoImpl = (UserDao)context.getBean("userDaoImpl");
        int adu  = userDaoImpl.add(12);
        System.out.println("adu = " + adu);
    }
}

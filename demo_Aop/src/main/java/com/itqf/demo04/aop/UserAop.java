package com.itqf.demo04.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * projectName:ssm
 *
 * @author: 三毛
 * time:2020/9/1415:37
 * description:
 */
@Component
public class UserAop {
    /**
     * 后置通知
     */
    public void after(){
        System.out.println("之后的方法===========");
    }

    /**
     * 前置通知
     */
    public void before(){
        System.out.println("之前的方法===");
    }

    /**
     * 后置通知
     * @param result
     */
    public void afterReturn(Object result){
        System.out.println("result = " +((int) result + 12));
        result = (int)result +1000 ;
    }

    /**
     * 环绕通知   最强大
     * @param proceedingJoinPoint
     * @return
     */
    public Object around(ProceedingJoinPoint proceedingJoinPoint){

        //可以在此处添加 可以在此处做方法前的功能增强
        System.out.println("around 前");
        Object proceed = 0 ;

        //相当于 proxy.invoke（）
        try {
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        //可以在此处添加 可以在此处做方法之后的功能增强
        System.out.println("around 后");
        //还能够修改返回值
        proceed =  (int)proceed + 8989 ;

       return proceed ;
    }

    /**
     * 异常通知
     * @param ex
     */
    public void throwth(Exception ex){
        System.out.println("ex = " + ex.getMessage());
    }
}

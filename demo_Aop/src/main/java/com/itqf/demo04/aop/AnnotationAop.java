package com.itqf.demo04.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//切面类
@Component// LogAop logAop = new LogAop()
@Aspect//表示的是一个切面类的注解
public class AnnotationAop {

    //设置切点 公共的切点
    @Pointcut("execution(* com.itqf.demo04.dao..*.*(..))")
    //是用来承载上卖弄注解的，没有实际的意义
    public  void pointcut() {}

    //开始时间
    //关注点
    //获取当前执行的方法的名字   只需要写JoinPoint接口即可
    //前置通知：指定切入的表达式
    @Before("pointcut()")
    public void begin (JoinPoint joinPoint) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "调用开始的时间:"+ simpleDateFormat.format(date));

    }
    //关注点
    @After("pointcut()")
    public void end () {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("调用结束的时间:"+ simpleDateFormat.format(date));

    }
    @AfterReturning("pointcut()")
    public void afterReturn () {
        System.out.println("after return ");
    }
    //异常返回的
    public  void afterException (Exception e) {
        System.out.println("after exception");
        System.out.println(e.getMessage());
    }
    //环绕通知  我个人在开发的时候使用较多， 必须给参数
    public void around (ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("环绕前");
        //日志
        try {
            //执行目标方法   add()  delete()
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后");
    }
}
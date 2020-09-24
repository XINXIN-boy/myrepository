package com.itqf.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/1911:27
 * description: 注解的测试
 */
@Controller
@SessionAttributes({"body"})
@RequestMapping("/annotation")
public class AnnotationController {

    @RequestMapping("/testrequestbody.do")
    public String testRequuestBody(@RequestBody String body , HttpSession session){

        System.out.println("body = " + body);
        session.setAttribute("body" , body);
        return "success" ;
    }
    @RequestMapping("/testrequestbody.do/{sid}.do")
    public String testRe(@PathVariable(name = "sid")String id ){
        System.out.println("id = " + id);
        return "success" ;
    }

}

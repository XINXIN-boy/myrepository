package com.itqf.demo02.controller;

import com.itqf.demo02.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/1918:06
 * description:
 */
@RequestMapping("/user")
@Controller
@SessionAttributes({"user"})
public class UserController {

    @RequestMapping("/login.do")
    public String login(User user , ModelMap model){
        System.out.println(" login 执行了 ");
        model.addAttribute("user" , user) ;
        return "success" ;
    }


    @RequestMapping("/testInterceptor.do")
    @ResponseBody
    public Map<String , Object> testInterceptor(){
        Map<String, Object> map = new HashMap<>();
        map.put("code" , 2) ;
        return map ;
    }

}

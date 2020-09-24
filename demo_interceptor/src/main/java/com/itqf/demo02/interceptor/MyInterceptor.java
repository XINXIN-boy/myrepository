package com.itqf.demo02.interceptor;

import com.itqf.demo02.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * projectName:springMVC
 *
 * @author: 三毛
 * time:2020/9/1919:55
 * description:自定义的拦截器
 */
public class MyInterceptor implements HandlerInterceptor {


    /**
     * 预处理
     *  return true  代表放行    执行下一个拦截器 或者执行controller中的方法
     *  return false 代表不放行  可以通过 request 或者 response 执行转发或者重定向
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle执行了");

        User  user = (User) request.getSession().getAttribute("user");
        if (user == null ) {
            System.out.println("user = " + user);
            response.sendRedirect(request.getContextPath()+"/login.html");
            return false;
        }else {
            return true ;
        }
    }

    /**
     * 后处理的方法
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle执行了");



    }

    /**
     *
     *最后执行的方法  在 不放行时的跳转页面 之后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}

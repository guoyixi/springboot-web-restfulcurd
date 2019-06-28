package com.tj.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springboot-web-restfulcurd
 * @Date: 2019/5/26 23:14
 * @Author: Mr.Deng
 * @Description:
 */
public class MyInterceptor implements HandlerInterceptor{

 @Override
 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

  Object username = request.getSession().getAttribute("username");
  System.out.println(username);
  if(username==null){
   request.setAttribute("msg","无权限，请先登录！");
   //response.sendRedirect("/index.html");
   request.getRequestDispatcher("/index.html").forward(request,response);
   return false;
  }else{
   return true;
  }
 }

 @Override
 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

 }

 @Override
 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

 }
}

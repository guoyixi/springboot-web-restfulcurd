package com.tj.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @program: springboot-web-restfulcurd
 * @Date: 2019/5/24 21:26
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
public class LoginController {

 @PostMapping("user/login")
 public String login(String username, String password, Map<String,String> map, HttpSession session){
  if(!StringUtils.isEmpty(password)&&password.equals("856856")){
   session.setAttribute("username",username);
   //防止表单重复提交
   return "redirect:/main.html";
  }else{
   map.put("msg","用户名或密码错误!");
   return "login";
  }
 }
}

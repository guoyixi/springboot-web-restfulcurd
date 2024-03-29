package com.tj.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: springboot-web-restfulcurd
 * @Date: 2019/5/21 15:33
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
public class HelloWorld {

/* @RequestMapping({"/", "/index.html"})
 public String index() {
  return "login";
 }*/

 @ResponseBody
 @RequestMapping("hello")
 public String hello() {
  return "Hellosss World";
 }

 @RequestMapping("success")
 public String success(Map<String, Object> map) {
  map.put("user", "<h1>你好鸭</h1> ");
  map.put("users", Arrays.asList("guoyixi", "tanjing", "huning"));
  return "success";
 }
}

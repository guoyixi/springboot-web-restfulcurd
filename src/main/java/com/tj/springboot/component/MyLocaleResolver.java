package com.tj.springboot.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @program: springboot-web-restfulcurd
 * @Date: 2019/5/26 22:14
 * @Author: Mr.Deng
 * @Description:
 */
public class MyLocaleResolver implements LocaleResolver{
 @Override
 public Locale resolveLocale(HttpServletRequest request) {
  String l = request.getParameter("l");
  Locale locale = request.getLocale();
  if(!StringUtils.isEmpty(l)){
   String[] split = l.split("_");
   locale = new Locale(split[0],split[1]);
  }
  return locale;
 }

 @Override
 public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

 }
}

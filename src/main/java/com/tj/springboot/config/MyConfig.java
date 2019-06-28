package com.tj.springboot.config;

import com.tj.springboot.component.MyInterceptor;
import com.tj.springboot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: springboot-web-restfulcurd
 * @Date: 2019/5/23 9:15
 * @Author: Mr.Deng
 * @Description:
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {

 @Bean
 public LocaleResolver localeResolver() {
  return new MyLocaleResolver();
 }

 @Override
 public void addViewControllers(ViewControllerRegistry registry) {
  System.out.println("请求映射成功！");
  registry.addViewController("/").setViewName("login");
  registry.addViewController("/index.html").setViewName("login");
  registry.addViewController("/main.html").setViewName("dashboard");

 }

 @Override
 public void addInterceptors(InterceptorRegistry registry) {
  System.out.println("注册拦截器成功！");
  HandlerInterceptor inter = new MyInterceptor();
  registry.addInterceptor(inter).addPathPatterns("/**").excludePathPatterns("/webjars/**","/asserts/**","/","/index.html","/user/login");
 }



}

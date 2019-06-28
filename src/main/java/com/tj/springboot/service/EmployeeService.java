package com.tj.springboot.service;

import com.tj.springboot.entities.Employee;

import java.util.Collection;

/**
 * @program: springboot-web-restfulcurd
 * @Date: 2019/5/28 16:25
 * @Author: Mr.Deng
 * @Description:
 */
public interface EmployeeService {

 public void save(Employee employee);
 public void update(Employee employee);
 public Collection<Employee> getAll();

 public Employee get(Integer id);

 public void delete(Integer id);


}

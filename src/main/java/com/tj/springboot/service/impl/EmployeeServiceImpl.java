package com.tj.springboot.service.impl;

import com.tj.springboot.mapper.EmployeeDao;
import com.tj.springboot.entities.Employee;
import com.tj.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @program: springboot-web-restfulcurd
 * @Date: 2019/5/28 16:27
 * @Author: Mr.Deng
 * @Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

 @Autowired
 private EmployeeDao dao;

 @Override
 public void save(Employee employee) {
  dao.save(employee);
 }

 @Override
 public void update(Employee employee) {
   dao.update(employee);
 }

 @Override
 public Collection<Employee> getAll() {
  return dao.selectAll();
 }

 @Override
 public Employee get(Integer id) {
  return dao.selectEmpById(id);
 }

 @Override
 public void delete(Integer id) {
  dao.delete(id);
 }
}

package com.tj.springboot.controller;

import com.tj.springboot.entities.Employee;
import com.tj.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @program: springboot-web-restfulcurd
 * @Date: 2019/5/27 10:46
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
public class EmployeeController {

 @Autowired
 private EmployeeService employeeService = null;



 @GetMapping("/emps")
 public String list(Model model){
  System.out.println("查询所有员工！");
  Collection<Employee> all = employeeService.getAll();
  for (Employee employee : all) {
   System.out.println(employee.getId());
  }
  
  model.addAttribute("emps",all);
  return "emp/list";
 }

 @GetMapping("/emp")
 public String toAddPage(Model model){
  System.out.println("来到添加页面！");
  //查询出所有部门
/*  Collection<Department> departments = ddao.getDepartments();
  model.addAttribute("depts",departments);*/

  //来到添加页面
  return "emp/add";
 }

 @PostMapping("/emp")
 public String addEmp(Employee employee){
  System.out.println("保存的员工信息！"+employee);
  employeeService.save(employee);
  return "redirect:/emps";
 }

 @GetMapping("/emp/{id}")
 public String toEditPage(@PathVariable Integer id,Model model){

  //查询部门
/*  Collection<Department> departments = ddao.getDepartments();
  model.addAttribute("depts",departments);*/

  //查询员工
  Employee employee = employeeService.get(id);
  model.addAttribute("emp",employee);

  return "emp/add";
 }


 @PutMapping("emp")
 public String updateEmp(Employee employee){

  System.out.println("修改员工的信息！"+employee);
  employeeService.save(employee);

  return "redirect:/emps";
 }

 @DeleteMapping("/emp/{id}")
 public String deleteEmp(@PathVariable Integer id){

  System.out.println("删除员工的信息："+id);
  employeeService.delete(id);

  return "redirect:/emps";
 }


}

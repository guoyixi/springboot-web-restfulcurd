package com.tj.springboot.mapper;

import com.tj.springboot.entities.Employee;

import java.util.Collection;

public interface EmployeeDao {

	public void save(Employee employee);
	public void update(Employee employee);
	public void delete(Integer id);

	public Collection<Employee> selectAll();
	
	public Employee selectEmpById(Integer id);

}

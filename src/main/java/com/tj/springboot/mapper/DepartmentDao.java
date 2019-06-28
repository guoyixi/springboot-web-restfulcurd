package com.tj.springboot.mapper;

import com.tj.springboot.entities.Department;

import java.util.Collection;


public interface DepartmentDao {

	public Collection<Department> getDepartments();
	public Department getDepartment(Integer id);

}

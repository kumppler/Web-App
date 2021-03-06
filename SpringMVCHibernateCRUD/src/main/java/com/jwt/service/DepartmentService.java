package com.jwt.service;

import java.util.List;

import com.jwt.model.Department;


public interface DepartmentService {

	public void createDepartment(Department department);

	public List<Department> getAllDepartments();

	public void deleteDepartment(Integer departmentId);

	public Department updateDepartment(Department department);

	public Department getDepartment(int departmentid);


}



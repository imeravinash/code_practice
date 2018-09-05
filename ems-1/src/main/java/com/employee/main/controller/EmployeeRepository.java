package com.employee.main.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	public List<Employee> findByDepartmentId(String id);
		
	
}

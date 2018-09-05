package com.employee.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(String d_id) {
		List<Employee> employees=new ArrayList<>();
		employeeRepository.findByDepartmentId(d_id)
		.forEach(employees::add);
		return employees;
	}

	public Employee getEmployee(String id) {
		return employeeRepository.findOne(id);
		
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	public void updateEmployee(Employee employees) {
		employeeRepository.save(employees);
		
	}

	public void deleteEmployee(String id) {
		employeeRepository.delete(id);
		
	}
	
	
}

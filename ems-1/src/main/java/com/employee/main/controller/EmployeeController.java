package com.employee.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.main.controller.EmployeeService;
import com.employee.main.department.Department;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/departments/{d_id}/employees")
	public List<Employee> getAllEmployees(@PathVariable String d_id) {
		return employeeService.getAllEmployees(d_id);
		
	}
	
	@RequestMapping("/departments/{d_id}/employees/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/departments/{d_id}/employees")
	public void addEmployee(@RequestBody Employee employee,@PathVariable String d_id) {
		employee.setDepartment(new Department(d_id,""));
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/departments/{d_id}/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id,@PathVariable String d_id) {
		employee.setDepartment(new Department(d_id,""));
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/departments/{d_id}/employees/{id}")
	public void deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}
}

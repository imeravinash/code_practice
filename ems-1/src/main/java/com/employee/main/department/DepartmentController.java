package com.employee.main.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("/departments")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
		
	}
	
	@RequestMapping("/departments/{id}")
	public Department getDepartment(@PathVariable String id) {
		return departmentService.getDepartment(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/departments")
	public void addDepartment(@RequestBody Department department) {
		departmentService.addDepartment(department);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/departments/{id}")
	public void updateDepartment(@RequestBody Department departments, @PathVariable String id) {
		departmentService.updateDepartment(id, departments);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/departments/{id}")
	public void deleteDepartment(@PathVariable String id) {
		departmentService.deleteDepartment(id);
	}
}

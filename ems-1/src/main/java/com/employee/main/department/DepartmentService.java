package com.employee.main.department;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments() {
		List<Department> departments=new ArrayList<>();
		departmentRepository.findAll()
		.forEach(departments::add);
		return departments;
	}

	public Department getDepartment(String id) {
		return departmentRepository.findOne(id);
		
	}

	public void addDepartment(Department department) {
		departmentRepository.save(department);
		
	}

	public void updateDepartment(String id, Department department) {
		departmentRepository.save(department);
		
	}

	public void deleteDepartment(String id) {
		departmentRepository.delete(id);
		
	}
	
	
}

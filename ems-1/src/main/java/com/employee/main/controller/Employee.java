package com.employee.main.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.employee.main.department.Department;

@Entity
public class Employee {

		@Id
		private String e_id;
		private String e_name;
		
		@ManyToOne
		private Department department;
		
		public Employee() {
			
		}

		
		public Employee(String e_id, String e_name, String department) {
			super();
			this.e_id = e_id;
			this.e_name = e_name;
			this.department = new Department(department,"");
		}


		public String getE_id() {
			return e_id;
		}

		public void setE_id(String e_id) {
			this.e_id = e_id;
		}

		public String getE_name() {
			return e_name;
		}

		public void setE_name(String e_name) {
			this.e_name = e_name;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}
		
}

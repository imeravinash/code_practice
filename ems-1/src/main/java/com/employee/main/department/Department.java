package com.employee.main.department;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

		@Id
		private String id;
		private String d_name;
		
		
		public Department() {
			
		}


		public Department(String id, String d_name) {
			super();
			this.id = id;
			this.d_name = d_name;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getD_name() {
			return d_name;
		}


		public void setD_name(String d_name) {
			this.d_name = d_name;
		}
		
}

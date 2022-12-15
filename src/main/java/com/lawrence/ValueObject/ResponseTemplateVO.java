package com.lawrence.ValueObject;

import com.lawrence.user.entity.Usero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private Usero user;
	private Department department;
	
	public void setUser(Usero user) {
		this.user = user;
	}
	public void setDepartment(Department department2) {
		System.out.println("What are you bringing "+department2.getDepartmentAddress());
		this.department = department2;
	}
	public Usero getUser() {
		return user;
	}
	public Department getDepartment() {
		return department;
	}
	
	

}

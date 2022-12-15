package com.lawrence.ValueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
   
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
	private String departmentCode;
	public Long getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
		
}



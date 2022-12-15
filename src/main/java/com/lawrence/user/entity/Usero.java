package com.lawrence.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usero {
    @Id
    @SequenceGenerator(name="user-sequence", sequenceName="user-sequence", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user-sequence")
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
    
    
	public Long getUserId() {
		return userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public Long getDepartmentId() {
		return departmentId;
	}

	
    
}

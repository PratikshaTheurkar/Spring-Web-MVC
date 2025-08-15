package com.example.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

	@NotEmpty(message = "Name is Mandatory")
	@Size(min = 3,max=8,message = "min 3 and max 8 char is allowed")
	private String name;
	@NotEmpty(message = "Email is Mandatory")
	@Email(message = "Enter valid email")
	private String email;
	@NotNull(message = "Phone Number is mandatory")
	private Long phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", PhoneNumber=" + phoneNumber + "]";
	}
	
	
}

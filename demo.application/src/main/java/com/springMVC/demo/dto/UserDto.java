package com.springMVC.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	
	private String name;
	private String email;
	private String contact;
	public String getName() {
		return name;
	}
	
	
	
	public UserDto() {
		super();
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}

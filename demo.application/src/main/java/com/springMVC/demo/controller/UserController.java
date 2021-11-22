package com.springMVC.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springMVC.demo.dto.UserDto;
import com.springMVC.demo.model.User;
import com.springMVC.demo.service.UserService;

 @RestController
public class UserController {
	
	@Autowired //inject object here
	UserService userservice;
	
	@PostMapping("/saveUser")
	public User save(@RequestBody UserDto userdto)
	{
		return userservice.saveUser(userdto);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return userservice.getAllRecords();
	}
	@GetMapping("/users/id")
	public Optional<User> getUsersById(@RequestParam int id) {
		
		return userservice.getRecordsById(id);
	}
	

}

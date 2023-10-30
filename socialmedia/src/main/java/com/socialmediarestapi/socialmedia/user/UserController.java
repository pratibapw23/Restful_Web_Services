package com.socialmediarestapi.socialmedia.user;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	UserDaoService userdao;

	public UserController(UserDaoService userdao) {
		super();
		this.userdao = userdao;
	}

	@GetMapping(path = "/users")
	public ArrayList<User> getAllUsers() {
		return userdao.findAll();
	}

	@PostMapping(path = "/users")
	public ResponseEntity<Object> saveUserRecord(@Valid @RequestBody User user) {
		User savedUser = userdao.saveUserRecord(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping(path = "/users/{id}")
	public User getSpecificUser(@PathVariable int id) {
		 User user= userdao.retriveSpecificUser(id);
		 if(user==null) {
			 throw new UserNotFoundException("id:"+id);
		 }
		 return user;
	}
	
	@DeleteMapping(path="/users/{id}")
	public void deleteUserRecord(@PathVariable int id) {
		User user=userdao.deteleUserRecord(id);
		if(user==null) {
			 throw new UserNotFoundException("id:"+id);
		 }
	}

}

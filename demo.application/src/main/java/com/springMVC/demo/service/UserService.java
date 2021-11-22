package com.springMVC.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.demo.dto.UserDto;
import com.springMVC.demo.model.User;
import com.springMVC.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	

	public User saveUser(UserDto userdto)
	{
		User user=new User();
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setContact(userdto.getContact());
		return userRepository.save(user);
	}
	public List<User> getAllRecords(){
		
		List<User> list=userRepository.findAll();
	return list;
		
	}
	public Optional<User> getRecordsById(int id) {
		Optional<User> list=userRepository.findById(id);
		return list;
	}
	

}

package com.springMVC.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springMVC.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	//public User findByEmailAndName(String email, String name);	

}

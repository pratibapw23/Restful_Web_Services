package com.socialmediarestapi.socialmedia.user;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	static ArrayList<User> users=new ArrayList<User>();
	private static int idcount=0;
	
	static {
		users.add(new User(idcount++,"Pratibha",LocalDate.now().minusYears(20)));
		users.add(new User(idcount++,"Neha",LocalDate.now().minusYears(40)));
		users.add(new User(idcount++,"Mayuri",LocalDate.now().minusYears(30)));
		users.add(new User(idcount++,"DIksha",LocalDate.now().minusYears(25)));
	}
	
	public ArrayList<User> findAll(){
		
		return users;
	}
		
	public User retriveSpecificUser(int id){
		User u=new User();
		for(User user:users) {
			if(user.getId()==id) {
				u=user;
			}
		}
		return u;
	}
	
	public User saveUserRecord(User user) {
		user.setId(idcount++);
		users.add(user);
		return user;
	}

	public User deteleUserRecord(int id) {
		
		User u=new User();
		for(User user:users) {
			if(user.getId()==id) {
				u=user;
			}
		}
		users.remove(u);
		return u;
	}
}

package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.random.Random;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService anotherUser;
	
	@Qualifier("anotherUser")
	@Autowired
	private UserService anotherUser1;
	
	@Autowired
	Random random;
	
	@GetMapping("/getUser")
	public String getUser() {
		System.out.println(anotherUser);
		System.out.println(anotherUser.getUserName());
		System.out.println(anotherUser1);
		System.out.println(anotherUser1.getUserName());
		System.out.println(random.sayHi());
		return anotherUser.getUserName();
	}
	
	@PostConstruct
	public void sayCreated() {
		System.out.println("created");
	}
}

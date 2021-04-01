package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserModel;
import com.example.repository.UserRepository;

@RestController
@RequestMapping("/signup")
public class SignupController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LoginController loginController;

	@PostMapping
	public boolean saveUser(@RequestBody UserModel user) {
		
		// This method helps to store users in the database and return true or false based on the database transaction
		
		userRepository.save(user);
		loginController.saveUser(user.getEmail(), user.getPassword());
		return true;
	}
	
}

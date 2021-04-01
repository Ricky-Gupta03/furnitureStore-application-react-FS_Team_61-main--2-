package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.LoginModel;
import com.example.repository.LoginRepository;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginRepository loginRepository;
	
	@PostMapping
	public boolean checkUser(@RequestBody LoginModel data) {
		
		// This method helps the user to sign up for the application and must return true or false
		
		Optional<LoginModel> result = loginRepository.findById(data.getEmail());
		if(result.isEmpty())
			return false;
		
		LoginModel lm = result.get();
		
		if(data.getPassword().equals(lm.getPassword()))
			return true;
		else
			return false;
	}
	
	public void saveUser(String userId, String password) {
		LoginModel data = new LoginModel();
		data.setEmail(userId);
		data.setPassword(password);
		
		loginRepository.save(data);
	}
	
}

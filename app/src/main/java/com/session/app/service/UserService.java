package com.session.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session.app.model.User;
import com.session.app.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User postUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	

}

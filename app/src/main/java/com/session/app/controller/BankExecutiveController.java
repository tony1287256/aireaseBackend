package com.session.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.session.app.model.BankExecutive;
import com.session.app.model.User;
import com.session.app.service.BankExecutiveService;
import com.session.app.service.UserService;

@RestController
public class BankExecutiveController {
	@Autowired
	private BankExecutiveService bankExecutiveService;
	@Autowired
	private UserService userService;
	
	@PostMapping("Executive/user/add")
	public BankExecutive postBankExecutive(@RequestBody BankExecutive bankExecutive) {
		
		User user = userService.postUser(bankExecutive.getUser());
		
		bankExecutive.setUser(user);
		bankExecutive = bankExecutiveService.postBankExecutive(bankExecutive);
		return bankExecutive;
	}

}

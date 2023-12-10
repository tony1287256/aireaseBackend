package com.session.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.session.app.dto.AccountDetailsDto;
import com.session.app.execption.InvalidIdException;
import com.session.app.model.Account;
import com.session.app.model.AccountDetails;
import com.session.app.model.AccountHolder;
import com.session.app.model.BankExecutive;
import com.session.app.service.AccountDetailsService;
import com.session.app.service.AccountHolderService;
import com.session.app.service.AccountService;
import com.session.app.service.BankExecutiveService;

@RestController
public class AccountDetailsController {
	
	@Autowired
	private AccountDetailsService accountDetailsService;
	@Autowired
	private BankExecutiveService bankExecutiveService;
	@Autowired
	private AccountHolderService accountHolderService;
	@Autowired
	private AccountService accountService;
	
			
	}
	
	
	



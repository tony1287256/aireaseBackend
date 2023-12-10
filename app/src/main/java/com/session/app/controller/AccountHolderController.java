package com.session.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.session.app.execption.InvalidIdException;
import com.session.app.model.Account;
import com.session.app.model.AccountHolder;
import com.session.app.service.AccountHolderService;

@RestController
public class AccountHolderController {

	
	@Autowired
	private AccountHolderService accountHolderService;
	
	
	@PostMapping("/accountHolder/post")
	public AccountHolder postAccountHolder(@RequestBody AccountHolder accountHolder){
		accountHolder= accountHolderService.postAccountHolder(accountHolder);
		return accountHolder;
		
	}
	

	@GetMapping("/accountHolder/getone/{id}")
	public ResponseEntity<?> getOne(@PathVariable("id")int id) {
		
		try {
		AccountHolder accountHolder = accountHolderService.getOne(id);
			return ResponseEntity.ok().body(accountHolder);
		} catch (InvalidIdException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}

}

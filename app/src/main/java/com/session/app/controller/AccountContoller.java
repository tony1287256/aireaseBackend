package com.session.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.session.app.execption.InvalidIdException;
import com.session.app.model.Account;
import com.session.app.service.AccountService;

@RestController
public class AccountContoller {

	@Autowired
	private AccountService accountService;

	@PostMapping("/account/post")
	public Account postAccount(@RequestBody Account account) {

		account = accountService.postAccount(account);
		return account;
	}
	
	@PutMapping("/account/update/{aid}")
	public ResponseEntity<?> updateAccount(@PathVariable("aid") int aid, @RequestBody Account newaccount) {

		return null;

	}
	
	
	@DeleteMapping("account/delete/{aid}")
	public ResponseEntity<?> deleteAccount(@PathVariable("aid") int aid) {
	    try {
	        Account account = accountService.getOne(aid);
	        accountService.deleteAccount(account);
	        return ResponseEntity.ok().body("account deleted successfully");
	    } catch (Exception e) {
	        return ResponseEntity.badRequest().body(e.getMessage());
	    }
	
		
	}

}

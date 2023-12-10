package com.session.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session.app.model.Account;
import com.session.app.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account postAccount(Account account) {

		return accountRepository.save(account);
	}

	public void deleteAccount(Account account) {
		
	   accountRepository.delete(account);
	}

	public Account getOne(int aid) {
	
		return accountRepository.getById(aid);
	}

	

}

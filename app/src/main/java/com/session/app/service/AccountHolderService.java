package com.session.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session.app.execption.InvalidIdException;
import com.session.app.model.AccountHolder;
import com.session.app.repository.AccountHolderRepository;

@Service
public class AccountHolderService {

	@Autowired
	private AccountHolderRepository accountHolderRepository;
	
	
	public AccountHolder postAccountHolder(AccountHolder accountHolder) {
		// TODO Auto-generated method stub
		return accountHolderRepository.save(accountHolder);
	}
	public  AccountHolder getOne(int id) throws InvalidIdException{
		Optional<AccountHolder> optional = accountHolderRepository.findById(id);
		
		if(!optional.isPresent()) {
			throw new InvalidIdException("account Holder id inavalid");
		}
				return optional.get();
	}
}

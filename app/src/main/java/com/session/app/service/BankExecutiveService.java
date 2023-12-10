package com.session.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session.app.model.BankExecutive;
import com.session.app.repository.BankExecutiveREpository;

@Service
public class BankExecutiveService {

	@Autowired
	private BankExecutiveREpository banExecutiveREpository;

	public  BankExecutive postBankExecutive(BankExecutive bankExecutive) {
		
		return banExecutiveREpository.save(bankExecutive);
	}

}

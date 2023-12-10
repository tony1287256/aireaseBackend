package com.session.app.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class AccountDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private LocalDate dateOfCreation;


public LocalDate getDateOfCreation() {
	return dateOfCreation;
}

public void setDateOfCreation(LocalDate dateOfCreation) {
	this.dateOfCreation = dateOfCreation;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



public AccountHolder getAccountHolder() {
	return accountHolder;
}

public void setAccountHolder(AccountHolder accountHolder) {
	this.accountHolder = accountHolder;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public BankExecutive getBankExecutive() {
	return bankExecutive;
}

public void setBankExecutive(BankExecutive bankExecutive) {
	this.bankExecutive = bankExecutive;
}

@OneToOne
private AccountHolder accountHolder;

@OneToOne
private Account account;

@ManyToOne
private BankExecutive bankExecutive;
}

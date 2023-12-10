package com.session.app.dto;

public class AccountDetailsDto {

	
	private int AccountHolderId;
	private int AccountId;
	private int BankExecutiveId;
	public int getAccountHolderId() {
		return AccountHolderId;
	}
	public void setAccountHolderId(int accountHolderId) {
		AccountHolderId = accountHolderId;
	}
	public int getAccountId() {
		return AccountId;
	}
	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	public int getBankExecutive() {
		return BankExecutiveId;
	}
	public void setBankExecutive(int bankExecutive) {
		BankExecutiveId = bankExecutive;
	}
	@Override
	public String toString() {
		return "AccountDetailsDto [AccountHolderId=" + AccountHolderId + ", AccountId=" + AccountId + ", BankExecutive="
				+ BankExecutiveId + "]";
	}
	
}

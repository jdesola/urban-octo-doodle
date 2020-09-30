package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Accountable[] getAccounts() {
		Accountable[] accountsArray = accounts.toArray(new Accountable[ accounts.size() ] );
		return accountsArray;
	}
	
	// Methods
	public void addAccount(Accountable newAccount) {
		this.accounts.add(newAccount);
	}
	
	public boolean isVip() {
		int accountTotal = 0;
		for ( Accountable account : accounts ) {
			accountTotal += account.getBalance();
		}
		if ( accountTotal >= 25000 ) {
			return true;
		} else {
			return false;
		}
		
	}
}

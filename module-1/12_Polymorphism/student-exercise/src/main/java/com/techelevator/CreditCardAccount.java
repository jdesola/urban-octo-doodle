package com.techelevator;

public class CreditCardAccount implements Accountable{
	
	// Data Members
	private String accountHolder;
	private String accountNumber;
	private int debt;
	
	// Constructors
	public CreditCardAccount(String accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.debt = 0;
	}
	
	// Getters
	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getDebt() {
		return debt;
	}
	
	// Methods
	public int pay(int amountToPay) {
		this.debt -= amountToPay;
		return this.debt;
	}
	
	public int charge(int amountToCharge) {
		this.debt += amountToCharge;
		return this.debt;
	}
	
	// Overridden Methods
	@Override
	public int getBalance() {
		return (this.debt) * (-1);
	}
}

package com.techelevator;

import java.math.BigDecimal;

public class BankAccount {
	
	
	// Data Members
	private String accountHolderName;
	private String accountNumber;
	protected int balance;

	// Constructors
	public BankAccount( String accountHolderName, String accountNumber ) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		BigDecimal balanceStart = new BigDecimal(0.0);
		this.balance = balanceStart.intValue();
	}
	
	public BankAccount ( String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		BigDecimal balanceStart = new BigDecimal(balance);
		this.balance = balanceStart.intValue();
	}

	
	//Getters
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	// Methods
	public int deposit(int amountToDeposit) {
		BigDecimal amountToModify = new BigDecimal(Math.abs(amountToDeposit));
		BigDecimal balanceToModify = new BigDecimal(this.balance);
		BigDecimal newBalance = balanceToModify.add(amountToModify);
		this.balance = newBalance.intValue();
		return this.balance;
	}
	
	public int withdraw(int amountToWithdraw) {
		BigDecimal amountToModify = new BigDecimal(Math.abs(amountToWithdraw));
		BigDecimal balanceToModify = new BigDecimal(this.balance);
		BigDecimal newBalance = balanceToModify.subtract(amountToModify);
		this.balance = newBalance.intValue();
		return this.balance;
	}
}

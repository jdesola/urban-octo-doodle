package com.techelevator;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount{

	// Constructors
	
	public SavingsAccount( String accountHolderName, String accountNumber ) {
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount( String accountHolderName, String accountNumber, int balance ) {
		super(accountHolderName, accountNumber, balance);
	}
	
	// Overridden Methods
	
	@Override
	public int withdraw(int amountToWithdraw) {
		if ( this.getBalance() < amountToWithdraw) {
			return this.balance;
		}
		if ( (this.getBalance() - Math.abs(amountToWithdraw)) < 150 ) {
			int serviceFee = 2;
			amountToWithdraw += serviceFee;
			BigDecimal newBalance = new BigDecimal(super.withdraw(amountToWithdraw));
			this.balance = newBalance.intValue();
			return this.balance;
		}
		return super.withdraw(amountToWithdraw);
	}
	
}

package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
	
	// Constructors
	
	public CheckingAccount( String accountHolderName, String accountNumber ) {
		super( accountHolderName, accountNumber );
	}
	
	public CheckingAccount( String accountHolderName, String accountNumber, int balance ) {
		super( accountHolderName, accountNumber, balance);
	}
	
	// Overridden Methods
	
	@Override
	public int withdraw(int amountToWithdraw) {
		final BigDecimal overdraftFee = new BigDecimal(10.00);
		if ( (this.getBalance() - Math.abs(amountToWithdraw)) < 0.00 && (this.getBalance() - Math.abs(amountToWithdraw)) > (-100.00)) {
			BigDecimal balanceAfterWithdrawal = new BigDecimal(super.withdraw(Math.abs(amountToWithdraw)));
			BigDecimal newBalance = balanceAfterWithdrawal.subtract(overdraftFee);
			this.balance = newBalance.intValue();
			return this.balance;
		} else if ( (this.getBalance() - amountToWithdraw) <= -100.00 ) {
			return this.getBalance();
		} else {
			BigDecimal balanceAfterWithdrawal = new BigDecimal(super.withdraw(Math.abs(amountToWithdraw)));
			this.balance = balanceAfterWithdrawal.intValue();
			return this.balance;
		}
	}
	
}

package com.techelevator.calculator;

public class Calculator {
	
	// Data Members
	private int result = 0;

	// Getter
	
	public int getResult() {
		return result;
	}
	
	
	// Methods
	
	public int add( int addEnd ) {
		this.result += addEnd;
		return this.result;
	}
	
	public int subtract(int subtrahend) {
		this.result -= subtrahend;
		return this.result;
	}
	
	public int multiply( int multiplier ) {
		this.result *= multiplier;
		return this.result;
	}
	
	public int power( int exponent ) {
		int exponentAbsolute = Math.abs( exponent );
		int numberToExponent = 1;
		for (int i = 0; i < exponentAbsolute; i++) {
			numberToExponent *= this.result;
		}
		this.result = numberToExponent;
		return this.result;
	}
	
	public void reset() {
		this.result = 0;
	}
}

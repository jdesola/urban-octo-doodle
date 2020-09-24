package com.techelevator.calculator;

public class Calculator {

	private int result = 0;

	public int getResult() {
		return result;
	}

	public int add( int addend ) {
		this.result += addend;
		return this.result;
	}
	
}

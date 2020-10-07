package com.techelevator.exceptions;

public class CustomException extends Exception {

	private String customValue;
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message, String customValue) {
		super(message);
		this.customValue = customValue;
	}
	
	public String getCustomValue() {
		return this.customValue;
	}
}

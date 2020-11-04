package com.techelevator.contacts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ContactNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4056329565374443346L;

	
	public ContactNotFoundException() {
		super("Contact not found");
	}
}

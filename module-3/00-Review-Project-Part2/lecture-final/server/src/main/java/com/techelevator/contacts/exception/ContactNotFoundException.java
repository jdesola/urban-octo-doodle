package com.techelevator.contacts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Contact not found")
public class ContactNotFoundException extends Exception {

	private static final long serialVersionUID = -5301955103190856176L;

	public ContactNotFoundException() {
		super("Contact not found");
	}
	
}

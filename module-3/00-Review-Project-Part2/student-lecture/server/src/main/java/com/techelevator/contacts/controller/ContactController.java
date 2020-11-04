package com.techelevator.contacts.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.contacts.dao.ContactDao;
import com.techelevator.contacts.exceptions.ContactNotFoundException;
import com.techelevator.contacts.model.Contact;

@PreAuthorize("isAuthenticated()")
@RestController
@RequestMapping("/contacts")
public class ContactController {

	private ContactDao contactDao;
	
	public ContactController(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	@PreAuthorize("permitAll")
	@RequestMapping(method=RequestMethod.GET)
	public List<Contact> list() {
		return contactDao.list();
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.GET)
	public Contact get(@PathVariable int id) throws ContactNotFoundException {
		Contact contact = contactDao.get(id);
		if (contact == null) {
			throw new ContactNotFoundException();
		}
		return contact;
	}
}

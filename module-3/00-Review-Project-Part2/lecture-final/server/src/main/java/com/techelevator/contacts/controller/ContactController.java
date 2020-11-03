package com.techelevator.contacts.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.contacts.dao.ContactDao;
import com.techelevator.contacts.model.Contact;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	private ContactDao contactDao;
	
	public ContactController(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Contact> list() {
		return contactDao.list();
	}
}

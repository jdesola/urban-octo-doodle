package com.techelevator.contacts.dao;

import java.util.List;

import com.techelevator.contacts.model.Contact;

public interface ContactDao {

	List<Contact> list();

	Contact get(int contactId);
}

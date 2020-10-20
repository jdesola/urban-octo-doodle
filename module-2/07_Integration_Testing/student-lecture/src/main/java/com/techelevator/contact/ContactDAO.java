package com.techelevator.contact;

import java.util.List;

public interface ContactDAO {

	void create(Contact contact);
	
	List<Contact> list();
	Contact getById( long contactId );
	List<Contact> searchByLastname(String lastName);
	
	void update(Contact contact);
	
	void delete( long contactId );
	
}

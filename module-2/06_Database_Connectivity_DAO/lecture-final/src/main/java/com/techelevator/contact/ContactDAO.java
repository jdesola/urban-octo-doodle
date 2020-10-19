package com.techelevator.contact;

import java.util.List;

public interface ContactDAO {

	List<Contact> list();
	Contact getById( long contactId );
	
	void create(Contact contact);
	
	void delete( long contactId );
	
}

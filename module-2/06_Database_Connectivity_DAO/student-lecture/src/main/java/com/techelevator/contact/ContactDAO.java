package com.techelevator.contact;

import java.util.List;

public interface ContactDAO {
	List<Contact> list();

	void create(Contact contact);
	
	Contact getById(long contactId);
	
	void delete( long contactId );
}

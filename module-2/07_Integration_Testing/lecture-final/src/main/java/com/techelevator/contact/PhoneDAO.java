package com.techelevator.contact;

import java.util.List;

public interface PhoneDAO {

	List<Phone> getByContactId(long contactId);
	
	void add(Phone phone);
	
	void update(Phone phone);
	
	void delete(long phoneId);
}

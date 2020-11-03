package com.techelevator.contacts.services;

import org.junit.*;

import com.techelevator.contacts.model.AuthenticatedUser;
import com.techelevator.contacts.model.Contact;

public class ContactServiceTest {

	private String url = "http://localhost:8080/";
	private String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6IlJPTEVfUk9MRV9VU0VSIiwiZXhwIjoxNjA0NTA3NTk1fQ.bdI5jANMpuXSK7Z6QsUtyOWtwS-mHYxr7wM-P-9-3D3MiSPpCnnWG8yJEKZ8UdSmEb72ST0o8dzNxJ6EUfPLWw";
	
	private ContactService contactService;
	
	@Before
	public void setup() {
		AuthenticatedUser user = new AuthenticatedUser();
		user.setToken(token);
		contactService = new ContactService(url, user);

	}

	@Test
	public void get_by_id() {
		Contact contact = contactService.getById(1);
	}
	
	@Test
	public void add_contact() {
		Contact contact = new Contact();
		contact.setFirstName("firstNameTest");
		contact.setLastName("lastNameTest");
		
		contact = contactService.add( contact );
		Assert.assertTrue( contact.getContactId() > 0 );
		
	}
	
}

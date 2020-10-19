package com.techelevator;

import java.util.List;
import java.util.Scanner;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.contact.Contact;
import com.techelevator.contact.ContactDAO;
import com.techelevator.contact.JdbcContactDAO;

public class ContactBookApp {

	private static final Scanner in = new Scanner( System.in );
	private ContactDAO contactDao;
	
	public ContactBookApp(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
	
	public void run() {
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/contacts");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		ContactDAO dao = new JdbcContactDAO( dataSource );
		
		ContactBookApp app = new ContactBookApp(dao);
		app.run();
		
		List<Contact> contacts = dao.list();
		
		for (Contact contact : contacts) {
			System.out.println( contact );
		}
		
		
		
		
		System.out.print("First Name >>>");
		String firstName = in.nextLine();
		
		System.out.print("Last Name >>>");
		String lastName = in.nextLine();
		
		Contact newContact = new Contact();
		newContact.setFirstName( firstName );
		newContact.setLastName( lastName );
		
		dao.create( newContact );
		
		System.out.println( newContact );
		
		System.out.print("Id >>>");
		long id = in.nextLong();
		in.nextLine();
		
		Contact retrievedContact = dao.getById( id );
		
		System.out.println( retrievedContact );
		
		System.out.print("Id to Delete >>>");
		id = in.nextLong();
		in.nextLine();
		
		dao.delete( id );
		
	}

}

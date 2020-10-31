package com.techelevator.contacts;

import java.util.List;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;

import com.techelevator.contacts.model.Contact;
import com.techelevator.contacts.services.ConsoleService;
import com.techelevator.contacts.services.ContactService;

public class App {

	private static final String CONTACT_API_URL = "http://localhost:8080/contacts";
	
	private static final int LIST_CONTACTS = 1;
	private static final int QUIT = 0;
	private static final ConsoleService console = new ConsoleService();
	private ContactService contactService;
	
	public void run() {
		
		try {
			contactService = new ContactService(CONTACT_API_URL);
			
			while(true) {
				int selection = console.getChoiceFromMainMenu();
				
				if (selection == LIST_CONTACTS) {
					listAllContacts();
				} else if (selection == QUIT) {
					break;
				} else {
					console.showInvalidSelection();
				}
			}
		} catch (ResourceAccessException e) {
			console.printResourceAccessException(e.getMessage());
		}
		
	}
	
	private void listAllContacts() {
		try {
			List<Contact> contacts = contactService.list();
			console.printContacts(contacts);
		}  catch (RestClientResponseException e) {
			console.printRestException(e);
		}
	}
	
	
 
    public static void main(String[] args) {
        new App().run();
        
    }

}

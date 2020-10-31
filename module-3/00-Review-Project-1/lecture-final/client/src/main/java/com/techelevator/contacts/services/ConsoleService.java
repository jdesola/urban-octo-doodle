package com.techelevator.contacts.services;

import java.util.List;
import java.util.Scanner;

import org.springframework.web.client.RestClientResponseException;

import com.techelevator.contacts.model.Contact;

public class ConsoleService {

  private Scanner scanner;

  public ConsoleService() {
    scanner = new Scanner(System.in);
  }

  public int getChoiceFromMainMenu() {
	  
	  int selection = 0;
	  
	  while(true) {
		  System.out.println("1) List Contacts");
		  System.out.println("0) Quit");
		  System.out.print(">>>");
		  String choice = scanner.nextLine();
		  
		  try {
			  selection = Integer.parseInt(choice);
			  break;
		  } catch (NumberFormatException e) {
			  System.out.println("Please select a number");
		  }
	  }
	  
	  return selection;
	  
  }
  
  public void showInvalidSelection() {
	  System.out.println("Invalid selection!");
  }
  
  public void printContacts(List<Contact> contacts) {
	  
	  
	  System.out.printf("%-10s%-36s%n", "Id", "Name");
	  System.out.printf("%-10s%-36s%n", "-----", "-----");
	  
	  for (Contact contact : contacts) {
		  System.out.printf("%-10s%-36s%n", 
				  contact.getContactId(), contact.getFullName());
	  }
	  
  }
  
  public void printRestException(RestClientResponseException e) {
	  System.out.println("An error has occured: ");
	  System.out.println(e.getRawStatusCode() + " : " + e.getStatusText() );
  }
  
  public void printResourceAccessException(String message) {
	  System.out.println("Unable to connect to API: " + message);
  }
  
}

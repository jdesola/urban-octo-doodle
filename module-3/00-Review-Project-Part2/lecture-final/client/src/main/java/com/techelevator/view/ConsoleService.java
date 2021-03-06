package com.techelevator.view;


import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.client.RestClientResponseException;

import com.techelevator.contacts.model.Contact;

public class ConsoleService {

	private PrintWriter out;
	private Scanner in;

	public ConsoleService(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output, true);
		this.in = new Scanner(input);
	}

	public Object getChoiceFromOptions(Object[] options) {
		Object choice = null;
		while (choice == null) {
			displayMenuOptions(options);
			choice = getChoiceFromUserInput(options);
		}
		out.println();
		return choice;
	}

	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOption = Integer.valueOf(userInput);
			if (selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (choice == null) {
			out.println("\n*** " + userInput + " is not a valid option ***\n");
		}
		return choice;
	}

	private void displayMenuOptions(Object[] options) {
		out.println();
		for (int i = 0; i < options.length; i++) {
			int optionNum = i + 1;
			out.println(optionNum + ") " + options[i]);
		}
		out.print("\nPlease choose an option >>> ");
		out.flush();
	}

	public String getUserInput(String prompt) {
		out.print(prompt+": ");
		out.flush();
		return in.nextLine();
	}

	public Integer getUserInputInteger(String prompt) {
		Integer result = null;
		do {
			out.print(prompt+": ");
			out.flush();
			String userInput = in.nextLine();
			try {
				result = Integer.parseInt(userInput);
			} catch(NumberFormatException e) {
				out.println("\n*** " + userInput + " is not valid ***\n");
			}
		} while(result == null);
		return result;
	}
	
	
	  public void printContacts(List<Contact> contacts) {
		  
		  
		  System.out.printf("%-10s%-36s%n", "Id", "Name");
		  System.out.printf("%-10s%-36s%n", "-----", "-----");
		  
		  for (Contact contact : contacts) {
			  System.out.printf("%-10s%-36s%n", 
					  contact.getContactId(), contact.getFullName());
		  }
		  
	  }
	  
	  public void printContact(Contact contact) {
		  System.out.printf("%-10s%-36s%n", "Id", "Name");
		  System.out.printf("%-10s%-36s%n", "-----", "-----");
		  System.out.printf("%-10s%-36s%n", 
				  contact.getContactId(), contact.getFullName());
	  }
	  
	  public void printRestException(RestClientResponseException e) {
		  System.out.println("An error has occured: ");
		  System.out.println(e.getRawStatusCode() + " : " + e.getStatusText() );
	  }
	  
	  public void printResourceAccessException(String message) {
		  System.out.println("Unable to connect to API: " + message);
	  }
	  
	  public void print400Status(RestClientResponseException e) {
		  System.out.println("Unable to add contact");
		  System.out.println("Error: " +e.getRawStatusCode() + " : " + e.getStatusText() );
		  System.out.println(e.getResponseBodyAsString());
	  }
}

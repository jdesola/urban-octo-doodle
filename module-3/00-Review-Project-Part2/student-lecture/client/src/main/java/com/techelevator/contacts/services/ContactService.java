package com.techelevator.contacts.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.techelevator.contacts.model.AuthenticatedUser;
import com.techelevator.contacts.model.Contact;

public class ContactService {

	private static String API_URL;
	private static final RestTemplate restTemplate = new RestTemplate();
	private AuthenticatedUser currentUser;
	
	public ContactService(String url, AuthenticatedUser currentUser) {
		this.API_URL = url + "contacts";
		this.currentUser = currentUser;
	}
	
	public List<Contact> list() {
		Contact[] contacts = restTemplate.getForObject(API_URL, 
				Contact[].class);
		return Arrays.asList(contacts);
	}
	
	public Contact getById(int id) {
		
		HttpHeaders header = new HttpHeaders();
		header.setContentType( MediaType.APPLICATION_JSON );
		header.setBearerAuth( currentUser.getToken() );
		HttpEntity<Contact> request = new HttpEntity<Contact>(new Contact(), header);
		
		Contact contact = restTemplate.exchange(API_URL + "/" + id,  HttpMethod.GET, request, Contact.class).getBody();
		
		return contact;
	}
}

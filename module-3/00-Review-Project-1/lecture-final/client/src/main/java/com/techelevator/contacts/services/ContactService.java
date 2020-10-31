package com.techelevator.contacts.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.techelevator.contacts.model.Contact;

public class ContactService {

	private static String API_URL;
	private static final RestTemplate restTemplate = new RestTemplate();
	
	public ContactService(String url) {
		this.API_URL = url;
	}
	
	public List<Contact> list() {
		Contact[] contacts = restTemplate.getForObject(API_URL, 
				Contact[].class);
		return Arrays.asList(contacts);
	}
}

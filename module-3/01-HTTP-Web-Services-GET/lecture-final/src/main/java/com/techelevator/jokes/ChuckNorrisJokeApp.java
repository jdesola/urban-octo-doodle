package com.techelevator.jokes;

import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

public class ChuckNorrisJokeApp {

	
	private static final String API_URL = "http://api.icndb.com/jokes/random?exclude=explicit";
	
	private static final RestTemplate restTemplate = new RestTemplate();
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Limit to nerdy jokes?");
		String choice = in.nextLine();
		
		String url = API_URL;
		if (choice.equalsIgnoreCase("Y")) {
			String queryStringParameter = "&limitTo=nerdy";
			url += queryStringParameter;
			// url = http://api.icndb.com/jokes/random?exclude=explicit    queryStringParameter = &limitTo=nerdy
		}
		
		ChuckNorrisJoke joke = restTemplate.getForObject( url, ChuckNorrisJoke.class );
		
		System.out.println( joke.getValue().getJoke() );

	}

}

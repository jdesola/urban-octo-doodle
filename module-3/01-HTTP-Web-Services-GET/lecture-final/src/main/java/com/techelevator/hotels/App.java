package com.techelevator.hotels;

import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

import com.techelevator.city.City;

public class App {

	private static final String API_BASE_URL = "http://localhost:3000/";
	
	// Spring Boot's RestTemplate is a full featured HTTP client that we can use to make
	// REST WebApi requests and get a response.
	private static RestTemplate restTemplate = new RestTemplate();
	

    private void run() {
        Hotel[] hotels = null;
        Scanner scanner = new Scanner(System.in);
        int menuSelection = 999;

        printGreeting();

        while(menuSelection != 0) {
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Error parsing the input for menu selection.");
            }
            System.out.println("");
            if (menuSelection == 1) {
                printHotels( requestHotels() );
            } else if (menuSelection == 2) {
                printReviews( requestReviews() );
            } else if (menuSelection == 3) {
                printHotel( requestHotelById(1) );
            } else if (menuSelection == 4) {
               printReviews( requestReviewsByHotelId( 1 ));
            } else if (menuSelection == 5) {
                printHotels( requestHotelsByStarRating( 3) );
            } else if (menuSelection == 6) {
                System.out.println( requestCityFromTeleportOrg() );
            } else if (menuSelection == 0) {
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            menuSelection = 999;
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            printGreeting();
        }
        scanner.close();
        System.exit(0);
    }

    private City requestCityFromTeleportOrg() {
    	City city = restTemplate.getForObject("https://api.teleport.org/api/cities/geonameid:5128581/", City.class);
    	return city;
    }
    
    
    private Hotel[] requestHotels() {
    	String url = API_BASE_URL + "hotels";
    	
    											// URL of the API Endpoint, the DataType.class to return
    	Hotel[] hotels = restTemplate.getForObject(url, Hotel[].class);
    	
    	
    	return hotels;
    }
    
    private Review[] requestReviews() {
    	Review[] reviews = restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
    	return reviews;
    }
    
    private Hotel requestHotelById( int id ) {
    	Hotel hotel = restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
    	return hotel;
    }
    
    private Review[] requestReviewsByHotelId(int hotelId) {
    	String url = API_BASE_URL + "hotels/" + hotelId + "/reviews";
    	Review[] reviews = restTemplate.getForObject(url, Review[].class);
    	return reviews;
    }
    
    // http://localhost:3000/hotels?stars=3
    private Hotel[] requestHotelsByStarRating( int stars ) {
    	String url = API_BASE_URL + "hotels?stars=" + stars;
    	Hotel[] hotels = restTemplate.getForObject( url, Hotel[].class );
    	return hotels;
    }
    
    private void printGreeting() {
        System.out.println("");
        System.out.println("Welcome to Tech Elevator Hotels. Please make a selection: ");
        System.out.println("1: List Hotels");
        System.out.println("2: List Reviews");
        System.out.println("3: Show Details for Hotel ID 1");
        System.out.println("4: List Reviews for Hotel ID 1");
        System.out.println("5: List Hotels with star rating 3");
        System.out.println("6: Custom Query");
        System.out.println("0: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
    }

    private void printHotels(Hotel[] hotels) {
        System.out.println("--------------------------------------------");
        System.out.println("Hotels");
        System.out.println("--------------------------------------------");
        for (Hotel hotel : hotels) {
            System.out.println(hotel.getId() + ": " + hotel.getName());
        }
    }

    private void printHotel(Hotel hotel) {
        System.out.println(hotel.toString());
    }

    private void printReviews(Review[] reviews) {
        for (Review review : reviews) {
            System.out.println(review.toString());
        }
    }


    public static void main(String[] args) {
        new App().run();
    }
}

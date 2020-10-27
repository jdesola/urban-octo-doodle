package com.techelevator.hotels.services;

import com.techelevator.hotels.models.Hotel;
import com.techelevator.hotels.models.Reservation;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

public class HotelService {

  private final String BASE_URL;
  private final RestTemplate restTemplate = new RestTemplate();
  private final ConsoleService console = new ConsoleService();

  public HotelService(String url) {
    BASE_URL = url;
  }

  /**
   * Create a new reservation in the hotel reservation system
   *
   * @param newReservation
   * @return Reservation
   */
  public Reservation addReservation(String newReservation) {

	  Reservation reservation = makeReservation(newReservation);
	  
	  if (reservation == null) {
		  return null;
	  }
	  
	  // API Code goes here
	  // Create the Header and set the ContentType to application/json
	  HttpHeaders headers = new HttpHeaders();
	  headers.setContentType(MediaType.APPLICATION_JSON);
	  // Create the request and pass it the header and the data for the message body
	  HttpEntity<Reservation> request = new HttpEntity<>(reservation, headers);
	  
	  // http://localhost:3000/hotels/1/reservations
	  String url = BASE_URL;  			//http://localhost:3000/
	  url += "hotels/";       			//http://localhost:3000/hotels/
	  url += reservation.getHotelID();  //http://localhost:3000/hotels/2
	  url += "/reservations";			//http://localhost:3000/hotels/2/reservations
	  
	  try {
		  reservation = restTemplate.postForObject(url, request, Reservation.class);
	  } catch (RestClientResponseException e) {
		  console.printError(e.getRawStatusCode() + " : " + e.getStatusText());
	  } catch (ResourceAccessException e) {
		  console.printError( e.getMessage() );
	  }
	  
	  return reservation;
  }

  /**
   * Updates an existing reservation by replacing the old one with a new
   * reservation
   *
   * @param CSV
   * @return
   */
  public Reservation updateReservation(String CSV) {
	  Reservation reservation = makeReservation(CSV);
	  if (reservation == null) {
	    return null;
	  }

	  // API Code goes here
	  
	  HttpHeaders headers = new HttpHeaders();
	  headers.setContentType( MediaType.APPLICATION_JSON );
	  
	  HttpEntity<Reservation> request = new HttpEntity<>(reservation, headers);
	  
	  try {
		  restTemplate.put(BASE_URL + "reservations/" + reservation.getId(), request);
	  } catch (RestClientResponseException e) {
		  console.printError(e.getRawStatusCode() + " : " + e.getStatusText());
	  } catch (ResourceAccessException e) {
		  console.printError( e.getMessage() );
	  }
	  
	  
	  return reservation;
  }

  /**
   * Delete an existing reservation
   *
   * @param id
   */
  public void deleteReservation(int id) {
	  // API Code goes here
	  try {
		  restTemplate.delete(BASE_URL + "reservations/" + id);
	  } catch (RestClientResponseException e) {
		  console.printError(e.getRawStatusCode() + " : " + e.getStatusText());
	  } catch (ResourceAccessException e) {
		  console.printError( e.getMessage() );
	  }
  }



  /**
   * List all hotels in the system
   *
   * @return
   */
  public Hotel[] listHotels() {
    Hotel[] hotels = null;
    // BASE_URL http://localhost:3000/
    // API Code goes here
    try {
    	hotels = restTemplate.getForObject(BASE_URL + "hotels", Hotel[].class);
    } catch (RestClientResponseException e) {
    	console.printError( "Raw Status Code: " + e.getRawStatusCode() );
    	console.printError("Status Text: " + e.getStatusText() );
    } catch (ResourceAccessException e) {
    	console.printError( e.getMessage() );
    }
    
    return hotels;
  }

  /**
   * Get the details for a single hotel by id
   *
   * @param id
   * @return Hotel
   */
  public Hotel getHotel(int id) {
    Hotel hotel = null;
    // http://localhost:3000/hotels/3
    String url = BASE_URL;  // http://localhost:3000/
    url += "hotels/";       // http://localhost:3000/hotels
    url += id; 				// http://localhost:3000/hotels/2
    		
    		
    try {	
    	hotel = restTemplate.getForObject(url, Hotel.class);
    } catch (RestClientResponseException e)  {  // Catches Resource exceptions from the API like 404, 401, 403, 500, etc.
    	console.printError(e.getRawStatusCode() + " " + e.getStatusText());
    } catch (ResourceAccessException e) {
    	console.printError( e.getMessage() );
    }

    
    return hotel;
  }

  
  /* DON'T MODIFY ANY METHODS BELOW */
  
  /**
   * List all reservations in the hotel reservation system
   *
   * @return Reservation[]
   */
  public Reservation[] listReservations() {
    Reservation[] reservations = null;
    try {
      reservations = restTemplate.getForObject(BASE_URL + "reservations", Reservation[].class);
    } catch (RestClientResponseException ex) {
      console.printError(ex.getRawStatusCode() + " : " + ex.getStatusText());
    } catch (ResourceAccessException ex) {
      console.printError(ex.getMessage());
    }
    return reservations;
  }

  /**
   * List all reservations by hotel id.
   *
   * @param hotelId
   * @return Reservation[]
   */
  public Reservation[] listReservationsByHotel(int hotelId) {
    Reservation[] reservations = null;
    try {
      reservations = restTemplate.getForObject(BASE_URL + "hotels/" + hotelId + "/reservations", Reservation[].class);
    } catch (RestClientResponseException ex) {
      console.printError(ex.getRawStatusCode() + " : " + ex.getStatusText());
    } catch (ResourceAccessException ex) {
      console.printError(ex.getMessage());
    }
    return reservations;
  }

  /**
   * Find a single reservation by the reservationId
   *
   * @param reservationId
   * @return Reservation
   */
  public Reservation getReservation(int reservationId) {
    Reservation reservation = null;
    try {
      reservation = restTemplate.getForObject(BASE_URL + "reservations/" + reservationId, Reservation.class);
    } catch (RestClientResponseException ex) {
      console.printError(ex.getRawStatusCode() + " : " + ex.getStatusText());
    } catch (ResourceAccessException ex) {
      console.printError(ex.getMessage());
    }
    return reservation;
  }

  private Reservation makeReservation(String CSV) {
    String[] parsed = CSV.split(",");

    // invalid input (
    if (parsed.length < 5 || parsed.length > 6) {
      return null;
    }

    // Add method does not include an id and only has 5 strings
    if (parsed.length == 5) {
      // Create a string version of the id and place into an array to be concatenated
      String[] withId = new String[6];
      String[] idArray = new String[] { new Random().nextInt(1000) + "" };
      // place the id into the first position of the data array
      System.arraycopy(idArray, 0, withId, 0, 1);
      System.arraycopy(parsed, 0, withId, 1, 5);
      parsed = withId;
    }

    return new Reservation(Integer.parseInt(parsed[0].trim()), Integer.parseInt(parsed[1].trim()), parsed[2].trim(),
        parsed[3].trim(), parsed[4].trim(), Integer.parseInt(parsed[5].trim()));
  }

}

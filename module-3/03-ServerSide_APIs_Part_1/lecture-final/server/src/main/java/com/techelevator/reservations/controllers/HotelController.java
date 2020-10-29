package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list(@RequestParam(required=false, defaultValue="") String state, @RequestParam(required=false) String city) {
        /*
         * Request Parameter without any arguments ( @RequestParam String state ) is required to process the request
         * or a 400 Bad Request will be returned.
         * 
         * Request Parameters can be made optional by required=false
         * Request Parameters can have a default defaultValue=value
         * 
         * Request parameters are null if not provided in the query string of the URL.
         * A default Value can be set for when they would be null
         */
    	
    	List<Hotel> hotels = hotelDAO.list();
    	List<Hotel> filteredHotels = new ArrayList<Hotel>();
    	
    	for (Hotel hotel: hotels) {
    		
    		if (city != null && state.length() > 0) {
    			if (hotel.getAddress().getCity().equalsIgnoreCase(city) &&
    					hotel.getAddress().getState().equalsIgnoreCase(state)) {
    				filteredHotels.add( hotel );
    			}
    		} else if (city != null) {
    			if (hotel.getAddress().getCity().equalsIgnoreCase(city)) {
    				filteredHotels.add( hotel );
    			}
    		}else if (state.length() > 0) {
    			if (hotel.getAddress().getState().equalsIgnoreCase(state)) {
    				filteredHotels.add( hotel );
    			}
    		} else {
    			filteredHotels.add( hotel );
    		}
    		
    	}
    	
   
    	return filteredHotels;
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDAO.get(id);
    }
    
    @RequestMapping(path="/reservations", method=RequestMethod.GET)
    public List<Reservation> listReservations() {
    	return reservationDAO.findAll();
    }
    
    @RequestMapping(path="/reservations/{reservationId}", method=RequestMethod.GET)
    public Reservation getReservation(@PathVariable int reservationId) {
    	return reservationDAO.get(reservationId);
    }
    
    /*
     * name="id" can be used in PathVariable to identify a variable of a different name
     */
    @RequestMapping(path="/hotels/{id}/reservations", method=RequestMethod.GET)
    public List<Reservation> getReservationsByHotel(@PathVariable(name="id") int hotelId) {
    	return reservationDAO.findByHotel(hotelId);
    }
    
    
    /*
     * @RequestBody tells spring boot that the JSON in the requests message body can be 
     * deserialized into the specific object
     */
    @RequestMapping(path="/hotels/{id}/reservations", method=RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation,  @PathVariable("id") int hotelId) {
    	return reservationDAO.create(reservation, hotelId);
    }
    
    
}

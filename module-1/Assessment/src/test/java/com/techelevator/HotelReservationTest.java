package com.techelevator;

import org.junit.*;

public class HotelReservationTest {
	private HotelReservation hotelReservation;
	
	@Before
	public void setup() {
		hotelReservation = new HotelReservation("Jack", 5);
	}
	
	@Test
	public void getEstimatedTotalReturnsProperTotal() {
		double dailyRate = 59.99;
		double accurateEstimate = hotelReservation.getNumberOfNights() * dailyRate; 
		Assert.assertEquals(accurateEstimate, hotelReservation.getEstimatedTotal(), 0.01); 
	}
	
	@Test
	public void calculateTotalReturnsProperTotalsForDifferentConditions() {
		double dailyRate = 59.99;
		double accurateEstimate = hotelReservation.getNumberOfNights() * dailyRate;
		double miniBarFee = 12.99;
		double cleaningFee = 34.99;
		double accurateTotalForJustMinibar = accurateEstimate + miniBarFee;
		double accurateTotalForJustCleaning = accurateEstimate + cleaningFee;
		double accureateTotalForCleaningAndMinibar = accurateEstimate + miniBarFee + ( cleaningFee * 2.00 );
		
		
		Assert.assertEquals("Both false conditions did not calculate properly", accurateEstimate, hotelReservation.calculateTotal(false, false), 0.01);
		Assert.assertEquals("usedMinibar true and cleaningRequired false did not calculate properly", accurateTotalForJustMinibar, hotelReservation.calculateTotal(false, true), 0.01);
		Assert.assertEquals("usedMinibar false and cleaningRequired true did not calculate properly", accurateTotalForJustCleaning, hotelReservation.calculateTotal(true, false), 0.01);
		Assert.assertEquals("Bot true conditions did not calculate properly", accureateTotalForCleaningAndMinibar, hotelReservation.calculateTotal(true, true), 0.01);
	}
}

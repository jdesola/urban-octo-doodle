package com.techelevator;

import java.math.BigDecimal;

public class HotelReservation {
	private String name;
	private int numberOfNights;
	private BigDecimal dailyRate = new BigDecimal(59.99);
	private double cleaningFee = 34.99;
	private double minibarFee = 12.99;
	
	public HotelReservation(String name, int numberOfNights) {
		this.name = name;
		this.numberOfNights = numberOfNights;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}
	
	public double getEstimatedTotal() {
		BigDecimal estimatedTotalBD =  dailyRate.multiply( new BigDecimal( numberOfNights ) );
		return estimatedTotalBD.doubleValue();
	}
	
	public double calculateTotal(boolean requiresCleaning, boolean usedMinibar) {
		BigDecimal estimatedTotalBD =  dailyRate.multiply( new BigDecimal( numberOfNights ) );
		if ( usedMinibar ) {
			estimatedTotalBD = estimatedTotalBD.add( new BigDecimal( minibarFee ) );
		} 
		if ( requiresCleaning ) {
			double cleaningFee = this.cleaningFee;
			if ( usedMinibar ) {
					cleaningFee *= 2.00;
			}
			estimatedTotalBD = estimatedTotalBD.add( new BigDecimal( cleaningFee ) );
		}
		
		return estimatedTotalBD.doubleValue();
	}
	
	public String toString() {
		return "RESERVATION - " + this.name + " - $" + this.getEstimatedTotal();
	}
}

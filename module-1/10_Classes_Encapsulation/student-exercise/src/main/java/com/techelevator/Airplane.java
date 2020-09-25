package com.techelevator;

public class Airplane {
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;

	
	// Constructors
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	// Getters
	
	public String getPlaneNumber() {
		return planeNumber;
	}


	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}


	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}


	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}


	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	// Derived Properties
	
	public int getAvailableFirstClassSeats() {
		return this.totalFirstClassSeats - this.bookedFirstClassSeats;
	}
	
	public int getAvailableCoachSeats() {
		return this.totalCoachSeats - this.bookedCoachSeats;
	}
	
	// Methods
	
	public boolean reserveSeats(boolean isForFirstClass, int totalNumberOfSeats) {
		if ( isForFirstClass ) {
			if ( this.totalFirstClassSeats - this.bookedFirstClassSeats >= totalNumberOfSeats ) {
				this.bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
		} else {
			if (this.getTotalCoachSeats() - this.bookedCoachSeats >= totalNumberOfSeats ) {
				this.bookedCoachSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
		}
	}
	
}

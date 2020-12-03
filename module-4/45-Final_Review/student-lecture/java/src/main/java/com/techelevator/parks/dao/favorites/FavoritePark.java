package com.techelevator.parks.dao.favorites;

public class FavoritePark {

	private String parkCode;
	
	public FavoritePark() {}
	
	public FavoritePark(String parkCode) {
		this.parkCode = parkCode;
	}

	public String getParkCode() {
		return parkCode;
	}

	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	
	
}

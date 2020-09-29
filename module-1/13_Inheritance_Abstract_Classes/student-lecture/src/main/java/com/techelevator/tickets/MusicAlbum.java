package com.techelevator.tickets;

import java.math.BigDecimal;
import java.util.List;

public class MusicAlbum implements Item {

	private double price;
	private String name;
	
	private List<String> trackList;
	private String labelName;
	private String artist;
	
	public MusicAlbum(double price, String name) {
		this.price = price;
		this.name = name;
	}
	
	
	@Override
	public BigDecimal getTotalPrice() {
		// TODO Auto-generated method stub
		return new BigDecimal(price).add( new BigDecimal(2) );
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public List<String> getTrackList() {
		return trackList;
	}


	public void setTrackList(List<String> trackList) {
		this.trackList = trackList;
	}


	public String getLabelName() {
		return labelName;
	}


	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}

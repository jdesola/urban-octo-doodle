package com.techelevator.tickets;

import java.math.BigDecimal;

public class Poster implements Item {

	private String name;
	private double price;
	
	public Poster(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public BigDecimal getTotalPrice() {
		return new BigDecimal( price );
	}

	@Override
	public String getName() {
		return name;
	}

}

package com.techelevator.tickets;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ticket implements Item {

	private BigDecimal price;
	
	public Ticket(double price) {
		this.price = new BigDecimal(price);
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public BigDecimal getFee() {
		return price.multiply( new BigDecimal(.20) );
	}
	
	public BigDecimal getTotalPrice() {
		BigDecimal totalCost = price.add( getFee() );
		totalCost = totalCost.setScale(2, RoundingMode.HALF_UP);
		return totalCost;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ticket";
	}

	
}

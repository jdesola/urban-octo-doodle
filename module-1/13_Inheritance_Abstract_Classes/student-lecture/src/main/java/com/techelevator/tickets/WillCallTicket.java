package com.techelevator.tickets;

import java.math.BigDecimal;

public class WillCallTicket extends Ticket {

	private String ticketHolderName;
	
	public WillCallTicket(double price, String ticketHolderName) {
		super(price);
		this.ticketHolderName = ticketHolderName;
	}
	
	public String getTicketHolderName() {
		return this.ticketHolderName;
	}
	
	@Override
	public BigDecimal getFee() {
		return super.getPrice().multiply( new BigDecimal(.10) );
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Will Call Ticket";
	}

}

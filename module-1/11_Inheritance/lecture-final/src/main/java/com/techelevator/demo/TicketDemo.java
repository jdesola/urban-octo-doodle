package com.techelevator.demo;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.tickets.Ticket;
import com.techelevator.tickets.VipTicket;
import com.techelevator.tickets.WillCallTicket;

public class TicketDemo {

	public static void main(String[] args) {
		
		Ticket ticket = new Ticket(20.00);
		
		System.out.println( ticket.getTotalPrice() );
		
		
		WillCallTicket willCallTicket = new WillCallTicket(20.00, "abc");
		
		System.out.println( willCallTicket.getTotalPrice() );
		
		VipTicket vipTicket = new VipTicket(20.00, 15.00);
		
		System.out.println( vipTicket.getTotalPrice() );
		
		
		List<Ticket> tickets = new ArrayList<Ticket>();
		tickets.add( ticket );
		tickets.add( willCallTicket );
		tickets.add( vipTicket );
		
		for ( Ticket t : tickets ) { 
			System.out.println( t.getFee() );
		}
		
		
		
		
		List<Object> objs = new ArrayList<Object>();
		objs.add( ticket );
		objs.add( willCallTicket );
		objs.add( vipTicket );
		
		for ( Object o : objs ) { 
			System.out.println( o.toString() );
		}
	}

}

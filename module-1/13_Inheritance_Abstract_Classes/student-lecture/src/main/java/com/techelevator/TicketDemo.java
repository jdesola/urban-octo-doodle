package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.tickets.Item;
import com.techelevator.tickets.MusicAlbum;
import com.techelevator.tickets.TShirt;
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
		
		List<Item> items = new ArrayList<Item>();
		items.add( new Ticket(10) );
		items.add( new VipTicket(12, 16));
		items.add( new WillCallTicket(17, "abc"));
		items.add( new TShirt("Abc Shirt"));
		items.add( new MusicAlbum(8, "xyz"));
		
		for (Item item : items) {
			System.out.println( item.getName() + " $" + item.getTotalPrice());
		}
		
		
		
	}

}


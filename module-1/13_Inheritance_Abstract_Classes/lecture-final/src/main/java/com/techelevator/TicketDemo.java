package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.tickets.CompactDisc;
import com.techelevator.tickets.DigitalDownload;
import com.techelevator.tickets.Item;
import com.techelevator.tickets.MusicAlbum;
import com.techelevator.tickets.Record;
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
		items.add( new CompactDisc(8, "New Kids on the Block"));
		items.add( new Record(15, "Journey", 12));
		items.add( new DigitalDownload(2, "Hit Baby One More Time"));
		
		for (Item item : items) {
			System.out.println( item.getName() + " $" + item.getTotalPrice());
		}
		
		
		
	}

}


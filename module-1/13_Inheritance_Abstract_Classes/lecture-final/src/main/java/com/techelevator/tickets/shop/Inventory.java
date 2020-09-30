package com.techelevator.tickets.shop;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.tickets.CompactDisc;
import com.techelevator.tickets.DigitalDownload;
import com.techelevator.tickets.Item;
import com.techelevator.tickets.Poster;
import com.techelevator.tickets.Record;
import com.techelevator.tickets.TShirt;
import com.techelevator.tickets.Ticket;
import com.techelevator.tickets.VipTicket;
import com.techelevator.tickets.WillCallTicket;

public class Inventory {

	public List<Item> get() {
		
		List<Item> items = new ArrayList<Item>();
		items.add( new Ticket(10) );
		items.add( new VipTicket(12, 16));
		items.add( new WillCallTicket(17, "abc"));
		items.add( new TShirt("Abc Shirt"));
		items.add( new TShirt("XyZ Shirt"));
		items.add( new CompactDisc(8, "New Kids on the Block"));
		items.add( new Record(15, "Journey", 12));
		items.add( new DigitalDownload(2, "Hit Baby One More Time"));
		items.add( new Poster("Tour Listing", 1));
		return items;
	}
	
}

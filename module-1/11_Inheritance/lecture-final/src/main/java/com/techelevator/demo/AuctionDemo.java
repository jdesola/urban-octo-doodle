package com.techelevator.demo;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.Auction;
import com.techelevator.Bid;
import com.techelevator.BuyoutAuction;
import com.techelevator.ReserveAuction;

public class AuctionDemo {

	public static void main(String[] args) {

		Auction auction = new Auction("Book");
		
	
		BuyoutAuction buyoutAuction = new BuyoutAuction("Record", 15);
	
		auction.placeBid( new Bid("abc", 10) );
		buyoutAuction.placeBid( new Bid("xyz", 22) );
		
		ReserveAuction reserveAuction = new ReserveAuction("DVD", 10);
		reserveAuction.placeBid( new Bid("rrr", 12));
		
		Auction buyOutAsAuction = buyoutAuction;
		Auction reserveAsAuction = reserveAuction;
		
		List<Auction> auctions = new ArrayList<Auction>();
		
		auctions.add( auction );
		auctions.add( buyoutAuction );
		auctions.add( reserveAuction );
		
		
		for (Auction a : auctions) {
			System.out.println(a.getHighBid().getBidder() + " " + a.getHighBid().getBidAmount()) ;
		}
		
	}

}

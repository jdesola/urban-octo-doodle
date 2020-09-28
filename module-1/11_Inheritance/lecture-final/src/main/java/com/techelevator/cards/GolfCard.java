package com.techelevator.cards;

public class GolfCard extends Card {

	public GolfCard(String suit, String rank) {
		super(suit, rank);
	}
	
	
	public int value() {
		if (getRank().equalsIgnoreCase("A")) {
			return 1;
		}
		
		if (getRank().equalsIgnoreCase("2")) {
			return -2;
		}
		
		if (getRank().equalsIgnoreCase("T") || getRank().equalsIgnoreCase("J")
				|| getRank().equalsIgnoreCase("Q")) {
			return 10;
		}
		
		if (getRank().equalsIgnoreCase("K")) {
			return 0;
		}
		
		return Integer.valueOf(getRank());
	}
	
	
}

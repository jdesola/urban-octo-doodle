package com.techelevator.tickets;

import java.math.BigDecimal;

public class Record extends MusicAlbum {

	private int size;
	
	public Record(double price, String name, int size) {
		super(price, name);
		this.size = size;
	}

	@Override
	protected BigDecimal calculateShippingCost() {
		if (size <= 7) {
			return new BigDecimal( 4 );
		}
		return new BigDecimal( 6 );
	}
	
	

}

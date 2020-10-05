package com.techelevator.tickets;

import java.math.BigDecimal;

public class CompactDisc extends MusicAlbum {

	public CompactDisc(double price, String name) {
		super(price, name);
	}

	@Override
	protected BigDecimal calculateShippingCost() {
		return new BigDecimal( 2.5 );
	}

}

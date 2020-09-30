package com.techelevator.tickets;

import java.math.BigDecimal;

public class DigitalDownload extends MusicAlbum {

	public DigitalDownload(double price, String name) {
		super(price, name);
	}

	@Override
	protected BigDecimal calculateShippingCost() {
		return BigDecimal.ZERO;
	}

}

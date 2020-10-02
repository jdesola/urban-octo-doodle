package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class CigarPartyTest {
	private CigarParty cigarParty;
	
	@Before
	public void setup() {
		cigarParty = new CigarParty();
	}
	
	@Test
	public void haveParty_returns_false_for_30_cigars_during_week(){
		// Arrange
		// Act
		boolean result = cigarParty.haveParty(30, false);
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void haveParty_returns_true_for_50_cigars_during_week() {
		// Arrange
		// Act
		boolean result = cigarParty.haveParty(50, false);
		// Assert
		Assert.assertTrue( result );
	}
	
	@Test
	public void haveParty_returns_true_for_70_cigars_during_weekend() {
		// Arrange
		// Act
		boolean result = cigarParty.haveParty(70,  true);
		// Assert
		Assert.assertTrue( result );
	}
	
	@Test
	public void haveParty_returns_false_for_20_cigars_during_weekend() {
		// Arrange
		// Act
		boolean result = cigarParty.haveParty(20, true);
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void haveParty_returns_false_for_65_cigars_during_week() {
		// Arrange
		// Act
		boolean result = cigarParty.haveParty(65, false);
		// Assert
		Assert.assertFalse( result );
	}
	
}

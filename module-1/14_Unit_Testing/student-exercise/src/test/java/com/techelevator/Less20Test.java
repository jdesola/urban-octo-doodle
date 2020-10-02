package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {
	private Less20 less20;
	
	@Before
	public void setup() {
		less20 = new Less20();
	}
	
	@Test
	public void isLessThanMultipleOf20_returns_true_for_39() {
		// Arrange
		// Act
		boolean result = less20.isLessThanMultipleOf20(39);
		// Assert
		Assert.assertTrue( result );
	}
	
	@Test
	public void isLessThanMultipleOf20_returns_true_for_58() {
		// Arrange
		// Act
		boolean result = less20.isLessThanMultipleOf20(58);
		// Assert
		Assert.assertTrue(result);
	}
	
	@Test
	public void isLessThanMultipleOf20_returns_false_for_40() {
		// Arrange
		// Act
		boolean result = less20.isLessThanMultipleOf20(40);
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void isLessThanMultipleOf20_returns_false_for_35() {
		// Arrange
		// Act
		boolean result = less20.isLessThanMultipleOf20(35);
		// Assert
		Assert.assertFalse( result );
	}
}

package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {
	private Lucky13 lucky13;
	
	@Before
	public void setup() {
		lucky13 = new Lucky13();
	}
	
	@Test
	public void getLucky_returns_true_with_no_1_or_3() {
		// Arrange
		int[] testArray = {0, 2, 4};
		// Act
		boolean result = lucky13.getLucky(testArray);
		// Assert
		Assert.assertTrue( result );
	}
	
	@Test
	public void getLucky_returns_false_with_1() {
		// Arrange
		int[] testArray = {1, 5, 9};
		// Act
		boolean result = lucky13.getLucky(testArray);
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void getLucky_returns_false_with_3() {
		// Arrange
		int[] testArray = {3, 6, 12};
		// Act
		boolean result = lucky13.getLucky(testArray);
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void getLucky_returns_true_with_null() {
		// Arrange
		int[] testArray = null;
		// Act
		boolean result = lucky13.getLucky(testArray);
		// Assert
		Assert.assertTrue( result );
	}
}

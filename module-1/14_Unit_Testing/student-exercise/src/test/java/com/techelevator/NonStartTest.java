package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {
	private NonStart nonStart;
	
	@Before
	public void setup() {
		nonStart = new NonStart();
	}
	
	@Test
	public void getPartialString_returns_ellohere_when_given_Hello_There() {
		// Arrange
		// Act
		String result = nonStart.getPartialString("Hello", "There");
		// Assert
		Assert.assertEquals("ellohere", result);
	}
	
	@Test
	public void getPartialString_returns_substring_of_b_if_a_empty() {
		// Arrange
		// Act
		String result = nonStart.getPartialString("", "Train");
		// Assert
		Assert.assertEquals("rain", result);
	}
	
	@Test
	public void getPartialString_returns_substring_of_a_if_b_empty() {
		// Arrange
		// Act
		String result = nonStart.getPartialString("Brand", "");
		// Assert
		Assert.assertEquals("rand", result);
	}
	
	@Test
	public void getPartialString_returns_substring_a_if_b_length_1() {
		// Arrange
		// Act
		String result = nonStart.getPartialString("Master", "A");
		// Assert
		Assert.assertEquals("aster", result);
	}
	
	@Test
	public void getPartialString_returns_substring_b_if_a_length_1() {
		// Arrange
		// Act
		String result = nonStart.getPartialString("B", "Bark");
		// Assert
		Assert.assertEquals("ark", result);
	}
}

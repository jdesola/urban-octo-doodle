package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {
	private StringBits stringBits;
	
	@Before
	public void setup() {
		stringBits = new StringBits();
	}
	
	@Test
	public void getBits_returns_empty_string_when_given_null() {
		// Arrange
		// Act
		String result = stringBits.getBits(null);
		// Assert
		Assert.assertEquals("", result);
	}
	
	@Test
	public void getBits_returns_Hlo_when_given_Hello() {
		// Arrange
		// Act
		String result = stringBits.getBits("Hello");
		// Assert
		Assert.assertEquals("Hlo", result);
	}
	
	@Test 
	public void getBits_returns_H_when_given_Hi() {
		// Arrange
		// Act
		String result = stringBits.getBits("Hi");
		// Assert
		Assert.assertEquals("H", result);
	}
	
	@Test
	public void getBits_returns_empty_when_given_empty() {
		// Arrange
		// Act
		String result = stringBits.getBits("");
		// Assert
		Assert.assertEquals("", result);
	}
	
}

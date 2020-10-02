package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {
	private FrontTimes frontTimes;
	
	@Before
	public void setup() {
		frontTimes = new FrontTimes();
	}
	
	@Test
	public void generateString_returns_first_3_letters_5_times() {
		// Arrange
		// Act
		String result = frontTimes.generateString("Chocolate", 2);
		// Assert
		Assert.assertEquals("ChoCho", result);
	}
	
	@Test
	public void generateString_returns_empty_for_null() {
		// Arrange
		// Act
		String result = frontTimes.generateString(null, 5);
		// Assert
		Assert.assertEquals("", result);
	}
	
	@Test
	public void generateString_returns_multiple_of_input_if_less_than_3_length() {
		// Arrange
		// Act
		String result = frontTimes.generateString("Bo", 4);
		// Assert
		Assert.assertEquals("BoBoBoBo", result);
	}
}

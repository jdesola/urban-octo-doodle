package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {
	private MaxEnd3 maxEnd3;
	
	@Before
	public void setup() {
		maxEnd3 = new MaxEnd3();
	}
	
	@Test
	public void makeArray_returns_first_digit_three_times() {
		// Arrange
		int[] testArray = {10, 5, 8};
		int[] expectedArray = {10, 10, 10};
		// Act
		int[] result = maxEnd3.makeArray(testArray);
		// Assert
		Assert.assertArrayEquals(expectedArray, result);
	}
	
	@Test
	public void makeArray_returns_last_digit_three_times() {
		// Arrange
		int[] testArray = {20, 3, 23};
		int[] expectedArray = {23, 23, 23};
		// Act
		int[] result = maxEnd3.makeArray(testArray);
		// Assert
		Assert.assertArrayEquals(expectedArray, result);
	}
	
	@Test
	public void makeArray_returns_positive_when_negative_is_in_first_or_last() {
		// Arrange
		int[] testArray = {-5, 5, 1};
		int[] expectedArray = {1, 1, 1};
		// Act
		int[] result = maxEnd3.makeArray(testArray);
		// Assert
		Assert.assertArrayEquals(expectedArray, result);
	}	
}

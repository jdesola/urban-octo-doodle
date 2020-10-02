package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
	private SameFirstLast sameFirstLast;
	
	@Before
	public void setup() {
		sameFirstLast = new SameFirstLast();
	}
	
	@Test
	public void isItTheSame_returns_false_when_given_null() {
		// Arrange
		int[] testArray = null;
		// Act
		boolean result = sameFirstLast.isItTheSame(testArray);
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void isItTheSame_returns_false_when_first_and_last_different() {
		// Arrange
		int[] testArray = {1, 2, 3};
		// Act
		boolean result = sameFirstLast.isItTheSame(testArray);
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void isItTheSame_returns_false_when_given_empty_array() {
		//Arrange
		int[] testArray = {};
		// Act
		boolean result = sameFirstLast.isItTheSame(testArray);
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void isItTheSame_returns_true_when_given_array_of_the_same_number() {
		// Arrange
		int[] testArray = {5, 5, 5, 5, 5};
		// Act
		boolean result = sameFirstLast.isItTheSame(testArray);
		// Assert
		Assert.assertTrue( result );
	}
	
	@Test
	public void isItTheSame_returns_true_when_given_array_of_length_one() {
		// Arrange
		int[] testArray = {28};
		// Act
		boolean result = sameFirstLast.isItTheSame(testArray);
		// Assert
		Assert.assertTrue( result );
	}
	
	@Test
	public void isItTheSame_returns_true_when_given_array_with_same_first_and_last_element() {
		// Arrange
		int[] testArray = {1, 2, 3, 3, 2, 1};
		// Act
		boolean result = sameFirstLast.isItTheSame(testArray);
		// Assert
		Assert.assertTrue( result );
	}
}

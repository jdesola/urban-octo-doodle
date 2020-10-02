package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {
	private DateFashion dateFashion;
	
	@Before
	public void setup() {
		dateFashion = new DateFashion();
	}
	
	@Test
	public void getATable_returns_2_when_you_are_5_date_is_10() {
		// Arrange
		// Act
		int result = dateFashion.getATable(5, 10);
		// Assert
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void getATable_returns_0_when_you_are_5_date_is_2() {
		// Arrange
		// Act
		int result = dateFashion.getATable(5, 2);
		// Assert
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void getATable_returns_1_when_you_and_date_are_5() {
		// Arrange
		// Act
		int result = dateFashion.getATable(5, 5);
		// Assert
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void getATable_returns_0_when_you_and_date_are_1() {
		// Arrange
		// Act
		int result = dateFashion.getATable(1, 1);
		// Assert
		Assert.assertEquals(0, result );
	}
	
	@Test
	public void getATable_returns_2_when_you_and_date_are_10() {
		// Arrange
		// Act
		int result = dateFashion.getATable(10, 10);
		// Assert
		Assert.assertEquals(2, result);
	}
}

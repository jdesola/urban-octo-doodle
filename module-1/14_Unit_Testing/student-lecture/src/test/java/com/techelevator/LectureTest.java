package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LectureTest {
	private Lecture lecture;
	
	@Before
	public void setup() {
		lecture  = new Lecture();
		System.out.println("Before");
	}
	
	@Test
	public void or35_multiple_of_3() {
		// Arrange (Setup) - if needed
		
		// Act (Test)
		boolean result = lecture.or35( 9 );
		
		// Assert (Verify)
		Assert.assertTrue( result );
	}
	
	@Test
	public void or35_not_multiple_of_3_or_5() {
		// Arrange
		// Act
		boolean result = lecture.or35( 17 );
		// Assert
		Assert.assertFalse( result );
	}
	
	@Test
	public void or35_multiple_of_3_and_5() {
		// Arrange
		// Act
		boolean result = lecture.or35( 15 );
		// Assert
		Assert.assertTrue( result );
	}
	
	@Test
	public void or35_negative_number() {
		// Arrange
		// Act
		boolean result = lecture.or35( -3 );
		// Assert
		Assert.assertFalse( result );
	}
}

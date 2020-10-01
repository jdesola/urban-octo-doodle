package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

public class LectureTest {

	private Lecture lecture;
	
	@Before
	public void setup() {
		lecture = new Lecture();
	}
	
	/*
	 * or35
	 * 
	 * Possible Tests
	 * 	-multiple of 3
	 *  -multiple of 5
	 *  -multiple of 3 and 5
	 *  -not a multiple of 3 or 5
	 *  - negative number
	 */
	
	@Test
	public void or35_multiple_of_3() {
		// Arrange  (Setup) - if needed
		
		// Act  (Test) 
		boolean result = lecture.or35( 9 );
		
		// Assert  (Verify)
		Assert.assertTrue( result );
		
	}
	
	@Test
	public void o35_multiple_of_5() {
		// Arrange
		// Act
		boolean result = lecture.or35( 10 );
		// Assert
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
	
	/*
	 * When a test case fails it maybe an error in the test case
	 * or an error in the code.  The requirements are the deciding factor.
	 * 
	 * If an error in the code, then the test case is correct.
	 */
	@Test
	public void or35_negative_number() {
		// Arrange
		// Act
		boolean result = lecture.or35( -3 );
		// Assert
		Assert.assertFalse( result );
	}
	
	
	/*
	 *  Tests for caughtSpeeding
	 */
	@Test
	public void speeding_at_65_when_not_birthday() {
		// Arrange
		// Act
		int ticketSize = lecture.caughtSpeeding(65, false);
		
		// Assert
		Assert.assertEquals(1, ticketSize);
	}
	
	/*
	 * Tests for firstTwo
	 * 
	 * 	Hello -> He  (word longer than 2 characters)
	 *  X ->  X  (word shorter than 2 characters)
	 *  "" -> "" (empty string)
	 *  xy -> xy  ( 2 character string)
	 *  null -> ""  (null) 
	 *  
	 */
	@Test
	public void firsttwo_full_word() {
		// Arrange
		// Act
		String result = lecture.firstTwo("Hello");
		// Assert
		Assert.assertEquals("He", result);
	}
	
	@Test
	public void firsttwo_empty_string() {
		// Arrange
		// Act
		String result = lecture.firstTwo("");
		// Assert
		Assert.assertEquals("String was not empty", "", result);
		
		/*
		 * These extra asserts are not needed to validate this test
		 * and are here for demonstration purposes
		 */
		Assert.assertNotNull("String was null", result);
		Assert.assertTrue( "Length was not 0", result.length() == 0);
	}
	
	/*
	 * Tests for no4LetterWords
	 */
	@Test
	public void list_with_one_4_letter_word() {
		// Arrange
		String[] words = {"Train", "Boat", "Car" };  // Array to send as test
		String[] wordsNo4Letters = { "Train", "Car" };  // expected results
		
		// Act
		List<String> results = lecture.no4LetterWords( words );
		
		// Assert
		Assert.assertNotNull(results);  // Make sure the list exists
			// Convert the list to an Array
		String[] actualResults = results.toArray( new String[results.size()] );
		
		// Now the AssertArray methods can be used
		Assert.assertArrayEquals(wordsNo4Letters, actualResults);
		
	}
	
	/*
	 * Tests for Rob Peter to Pay Paul
	 */
	@Test
	public void transfer_half_of_peters_money() {
		// Arrange
		Map<String, Integer> peterPaul = new HashMap<String, Integer>();
		peterPaul.put("Peter", 2000);
		peterPaul.put("Paul", 99);
		
		// Act
		Map<String, Integer> resultMap = lecture.robPeterToPayPaul( peterPaul );

		// Assert
		Assert.assertEquals("Peter has incorrect amount", new Integer(1000), resultMap.get("Peter"));
		Assert.assertEquals("Paul has incorrect amount",  new Integer(1099), resultMap.get("Paul"));
	}
	
	/*
	 * Testing with double
	 */
	@Test
	public void testing_double_as_whole_number() {
		double result = lecture.thirdDouble(9);
		Assert.assertEquals(3, result, 0);  // Scale of 0 compares only the whole number
	}
	
	@Test
	public void testing_double_with_rounding_error() {
		double result = lecture.thirdDouble(5);
		System.out.println( result );
		Assert.assertEquals(1.66, result, 2);
	}
	
	/*
	 * Testing with custom Objects
	 */
	@Test
	public void return_dog_and_assert_with_method() {
		Dog ourDog = new Dog("Fiddo", "Beagle", 7);
		
		Dog returnedDog = lecture.returnOurDog( ourDog );
		
		// AssertEquals only works for classes with a .equals() Override
		//Assert.assertEquals(ourDog, returnedDog);
		
		assertDogsEqual( ourDog, returnedDog );
	}
	
	/*
	 * Can put asserts in private metods that are called from the the Test methods
	 * If an assert fails here, the test that called will fail
	 */
	private void assertDogsEqual(Dog expected, Dog actual) {
		Assert.assertEquals(expected.getName(), actual.getName());
		Assert.assertEquals(expected.getBreed(), actual.getBreed());
		Assert.assertEquals(expected.getAge(), actual.getAge());
	}
	
	@Test
	public void return_dog_and_assert_with_equals() {
		Dog ourDog = new Dog("Fiddo", "Beagle", 7);
		Dog returnedDog = lecture.returnOurDog( ourDog );
		// Assert equals can be used with custom classes as long as .equals is Overridden in that class
		Assert.assertEquals(ourDog, returnedDog);
	}
	
	
}

package com.techelevator;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	private WordCount wordCount;
	
	@Before
	public void setup() {
		wordCount = new WordCount();
	}
	
	@Test
	public void getCount_given_barkX4_colaX2_forX3_boX2() {
		// Arrange
		String[] testArray = {"bark", "bark", "bark", "bark", "cola", "cola", "for", "for", "for", "bo", "bo"};
		// Act
		Map<String, Integer> result = wordCount.getCount(testArray);
		// Assert
		Assert.assertEquals(new Integer(4), result.get("bark"));
		Assert.assertEquals(new Integer(2), result.get("cola"));
		Assert.assertEquals(new Integer(3), result.get("for"));
		Assert.assertEquals(new Integer(2), result.get("bo"));
	}
	
	@Test
	public void getCount_CocaX2_colaX4_cocaX1() {
		// Arrange
		String[] testArray = {"Coca", "cola", "coca", "Coca", "cola", "cola", "cola"};
		// Act
		Map<String, Integer> result = wordCount.getCount(testArray);
		// Assert
		Assert.assertEquals(new Integer(2), result.get("Coca"));
		Assert.assertEquals(new Integer(4), result.get("cola"));
		Assert.assertEquals(new Integer(1), result.get("coca"));
	}
	
	@Test
	public void getCount_empty_string_array() {
		// Arrange
		String[] testArray = {};
		// Act
		Map<String, Integer> result = wordCount.getCount(testArray);
		// Assert
		Assert.assertTrue( result.isEmpty() );
	}
	
	@Test
	public void getCount_first_string_seen_is_first() {
		String[] testArray = {"Bee", "Bee", "Busy", "Bee"};
		Map<String, Integer> result = wordCount.getCount(testArray);
		for ( String string : result.keySet() ) {
			if ( string.equals("Bee") ) {
				Assert.assertEquals(new Integer(3), result.get("Bee"));
				break;
			}
		}
	}
	
	@Test
	public void getCount_null_returns_empty_Map() {
		Map<String, Integer> result = wordCount.getCount(null);
		Assert.assertTrue( result.isEmpty());
	}
}

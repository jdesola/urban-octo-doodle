package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {
	private AnimalGroupName animalGroupName;
	
	@Before
	public void setup() {
		animalGroupName  = new AnimalGroupName();
	}
	
	@Test
	public void getHerd_returns_Herd_for_Elephant() {
		// Arrange
		// Act
		String result = animalGroupName.getHerd("Elephant");
		// Assert
		Assert.assertEquals("Herd", result);
	}
	
	@Test
	public void getHerd_returns_Crash_for_rhino() {
		// Arrange
		// Act
		String result = animalGroupName.getHerd("rhino");
		// Assert
		Assert.assertEquals("Crash", result);
	}
	
	@Test
	public void getHerd_returns_unknown_for_animal_not_in_list() {
		// Arrange
		// Act
		String result = animalGroupName.getHerd("walrus");
		// Assert
		Assert.assertEquals("unknown", result);
	}
	
	@Test
	public void getHerd_returns_unknown_for_empty_string() {
		// Arrange
		// Act
		String result = animalGroupName.getHerd("");
		// Assert
		Assert.assertEquals("unknown", result);
	}
	
	@Test
	public void getHerd_returns_unknown_for_null() {
		// Arrange
		// Act
		String result = animalGroupName.getHerd(null);
		// Assert
		Assert.assertEquals("unknown", result);
	}
}

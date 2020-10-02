package com.techelevator.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	private FruitTree fruitTree;
	private final static int STARTING_NUMBER_FRUIT = 10;
	
	@Before
	public void setup() {
		fruitTree = new FruitTree("Pears", STARTING_NUMBER_FRUIT);
	}
	
	@Test
	public void pick_one_fruit() {
		// Arrange
		// Act
		int fruitToPick = 1;
		boolean result = fruitTree.pickFruit(fruitToPick);
		// Assert
		Assert.assertTrue( result );
		
		// Verify side effect
		int fruitLeft = fruitTree.getPiecesOfFruitLeft();
		int expectedFruitLeft = STARTING_NUMBER_FRUIT - fruitToPick;
		Assert.assertEquals(expectedFruitLeft, fruitLeft);
	}
	
	@Test
	public void pick_all_fruit() {
		// Arrange
		// Act
		boolean result = fruitTree.pickFruit(STARTING_NUMBER_FRUIT);
		// Assert
		Assert.assertEquals(true, result);
		Assert.assertEquals(0, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_too_many_fruit() {
		// Arrange
		// Act
		boolean result = fruitTree.pickFruit(STARTING_NUMBER_FRUIT + 1);
		// Assert
		Assert.assertFalse(result);
		Assert.assertEquals(STARTING_NUMBER_FRUIT, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_fruit_multiple_times() {
		// Arrange
		fruitTree.pickFruit(3);
		fruitTree.pickFruit(4);
		
		// Act and Assert
		Assert.assertTrue( fruitTree.pickFruit(3));
		Assert.assertEquals( 0, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_fruit_multiple_times_then_too_many() {
		// Arrange
		fruitTree.pickFruit(3);
		fruitTree.pickFruit(4);
		
		// Act and Assert
		Assert.assertFalse( fruitTree.pickFruit(4));
		Assert.assertEquals( 3, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_all_fruit_and_one_more() {
		// Arrange
		fruitTree.pickFruit(STARTING_NUMBER_FRUIT);
		// Act and Assert
		Assert.assertFalse( fruitTree.pickFruit(1) );
		Assert.assertEquals(0, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_zero_fruit() {
		// Arrange
		// Act and Assert
		Assert.assertTrue( fruitTree.pickFruit(0));
		Assert.assertEquals(STARTING_NUMBER_FRUIT, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_negative_fruit() {
		// Arrange
		// Act and Assert
		Assert.assertFalse( fruitTree.pickFruit(-1));
		Assert.assertEquals(STARTING_NUMBER_FRUIT, fruitTree.getPiecesOfFruitLeft());
	}
}

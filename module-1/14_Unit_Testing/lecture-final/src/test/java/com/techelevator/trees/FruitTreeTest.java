package com.techelevator.trees;

import org.junit.*;


public class FruitTreeTest {

	private FruitTree fruitTree;
	
	private final static int STARTING_NUMBER_FRUIT = 10;
	
	@Before
	public void setup() {
		fruitTree = new FruitTree("Pears", STARTING_NUMBER_FRUIT);
	}
	/*
	 * -successful - 1 fruit
	 * -successful - 10 fruit
	 * -fail - 11 fruit
	 * -success - pick 3, then 7
	 * -fail - pick 5, then 6
	 * pick 0 fruit
	 * pick -1 fruit
	 * fail - pick all fruit, then 1 more
	 *
	 */
	
	@Test
	public void pick_one_fruit() {
		// Arrange (Setup)
		// Act (Test)
		int fruitToPick = 1;
		boolean result = fruitTree.pickFruit(fruitToPick);
		// Assert (Verify)
		Assert.assertTrue(result);
		
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
		Assert.assertTrue(result);
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
		fruitTree.pickFruit(3);  // 7 left
		fruitTree.pickFruit(4);  // 3 left
		
		// Act and Assert
		Assert.assertTrue( fruitTree.pickFruit(3) );
		Assert.assertEquals(0, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_fruit_multiple_times_the_too_many() {
		// Arrange
		fruitTree.pickFruit(3);  // 7 left
		fruitTree.pickFruit(4);  // 3 left
		
		// Act and Assert
		Assert.assertFalse( fruitTree.pickFruit(4) );
		Assert.assertEquals(3, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_all_fruit_and_one_more() {
		// Arrange
		fruitTree.pickFruit(STARTING_NUMBER_FRUIT);
		// Act and Assert
		Assert.assertFalse( fruitTree.pickFruit(1) );
		Assert.assertEquals(0, fruitTree.getPiecesOfFruitLeft() );
	}
	
	@Test
	public void pick_zero_fruit() {
		// Arrange
		// Act and Assert
		Assert.assertTrue( fruitTree.pickFruit(0) );
		Assert.assertEquals( STARTING_NUMBER_FRUIT, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_negative_fruit() {
		// Arrange
		// Act and Assert
		Assert.assertFalse( fruitTree.pickFruit( -1) );
		Assert.assertEquals( STARTING_NUMBER_FRUIT, fruitTree.getPiecesOfFruitLeft() );
	}
	
}

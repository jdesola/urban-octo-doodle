package com.techelevator;

import org.junit.*;

public class Less20Test {

	private Less20 target;
	
	@Before
	public void createLess20() {
		target = new Less20();
	}
	
	@Test
	public void one_less_than_multiple_of_20() {
		Assert.assertTrue( target.isLessThanMultipleOf20( 19 ));
	}
	
	@Test
	public void two_less_than_mutliple_of_20() {
		Assert.assertTrue( target.isLessThanMultipleOf20( 18 ) );
	}
	
}

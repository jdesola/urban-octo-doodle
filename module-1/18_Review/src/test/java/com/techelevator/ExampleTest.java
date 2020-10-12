package com.techelevator;

import org.junit.*;

public class ExampleTest {

//	Reservation res = new Reservation("name", 10);
	
	//public Reservation(String name, int numberOfNights)
	
//	@Test
//	public void test_estimated_total() {
//		Assert.assertEquals( res.getEstimateTotal(), 10 * rate )
//	}
//	
//	@Test
//	public void test_estimated_total_with_negative_stay() {
//		Reservation resWithNegative = new Reservation("name", -5);
//		Assert.assertEquals( resWithNegative.getEstimateTotal(), 10 * rate )
//	}
	
	
	@Test
	public void double_assert() {
		
		double x = 3.15;
		double y = 3.156789131;
		
		Assert.assertEquals(x, y, 4);
		
	}
	
}

package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataFizzBuzzTest {
	private KataFizzBuzz kataFizzBuzz;
	
	@Before
	public void setup() {
		kataFizzBuzz = new KataFizzBuzz();
	}
	
	@Test
	public void fizzBuzzReturnsFizzForMultipleThree() {
		int fizzBuzzTester = 24;
		Assert.assertEquals("Fizz", kataFizzBuzz.fizzBuzz(fizzBuzzTester));
	}
	
	@Test
	public void fizzBuzzReturnsBuzzForMultipleFive() {
		int fizzBuzzTester = 10;
		Assert.assertEquals("Buzz", kataFizzBuzz.fizzBuzz(fizzBuzzTester));
	}
	
}

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
	
	@Test
	public void fizzBuzzReturnsFizzBuzzForMultipleThreeAndFive() {
		int fizzBuzzTester = 30;
		Assert.assertEquals("FizzBuzz", kataFizzBuzz.fizzBuzz(fizzBuzzTester));
	}
	
	@Test
	public void fizzBuzzReturnsInputAsStringIfNotMultipleOfThreeOrFive() {
		int fizzBuzzTester = 22;
		Assert.assertEquals("22", kataFizzBuzz.fizzBuzz(fizzBuzzTester));
	}
	
	@Test
	public void fizzBuzzReturnsEmptyStringIfInputNotBetween1And100() {
		int fizzBuzzTester = 105;
		Assert.assertEquals("", kataFizzBuzz.fizzBuzz(fizzBuzzTester));
	}
}

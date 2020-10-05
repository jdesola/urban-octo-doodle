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
	
	@Test
	public void fizzBuzzReturnsFizzIfInputIsMultipleOfThreeOrContainsThree() {
		int fizzBuzzTester1 = 23;
		int fizzBuzzTester2 = 42;
		Assert.assertEquals("Testing for containing the number 3", "Fizz", kataFizzBuzz.fizzBuzz(fizzBuzzTester1));
		Assert.assertEquals("Testing for being a multiple of 3", "Fizz", kataFizzBuzz.fizzBuzz(fizzBuzzTester2));
	}
	
	@Test
	public void fizzBuzzReturnBuzzIfInputIsMultipleOfFiveOrContainsFive() {
		int fizzBuzzTester1 = 25;
		int fizzBuzzTester2 = 10;
		Assert.assertEquals("Testing for containing the number 5", "Buzz", kataFizzBuzz.fizzBuzz(fizzBuzzTester1));
		Assert.assertEquals("Testing for being a multiple of 5", "Buzz", kataFizzBuzz.fizzBuzz(fizzBuzzTester2));
	}
}

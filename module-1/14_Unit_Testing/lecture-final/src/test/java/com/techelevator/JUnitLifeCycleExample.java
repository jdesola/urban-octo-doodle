package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitLifeCycleExample {

	private Lecture lecture;
	
	/* 
	 * Before is run before EACH test is run 
	 * and is used to setup the code being tested 
	 * */
	@Before
	public void setup() {
		lecture = new Lecture();
		System.out.println("Before");   // System.out.println's here for lecture demonstration and should never be in Test Cases
	}
	
	/* 
	 * After is run after EACH test is run
	 * and is used to cleanup anything that remains
	 * after the test is executed. 
	 */
	@After
	public void cleanUp() {
		System.out.println("After");
	}
	
	/*
	 * At least one method must have @Test
	 * Only methods with @Test are test cases
	 * All methods with @Test will be executed as Tests when Run As -> JUnit
	 */
	@Test
	public void test_one() {
		System.out.println("Test One");
	}
	
	@Test
	public void test_two() {
		System.out.println("Test Two");
	}
	
	@Test
	public void test_three() {
		System.out.println("Test Three");
	}
	
}

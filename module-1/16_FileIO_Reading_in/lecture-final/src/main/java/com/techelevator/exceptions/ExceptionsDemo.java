package com.techelevator.exceptions;

public class ExceptionsDemo {

	public static void main(String[] args)  {

		int[] nums = {1,2,3};
		int x = 0;
		
		/*
		 * try block identifies code that is at risk of throwning
		 * an exception
		 */
		try {
			System.out.println("Line 1");
			
			x = nums[3]; // ArrayIndexOutOfBoundsException occurs here
			
			// This code is skipped when an exception is thrown
			System.out.println("Line 2");
			
		/*
		 * catch block is code that will run if an exception is thrown.  The
		 * exception is identified by the Exception class in the argument
		 */
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println( e.getMessage() );
			e.printStackTrace();
		
		/*
		 * finally block is code that will always run - both when an exception occurs
		 * and when it does not.
		 */
		} finally {
			System.out.println("The finally always runs");
			x += 10;
		}
		
		System.out.println("x is " + x);

		
		/*
		 * Can have multiple catch blocks
		 */
		String str = null;
		
		try {
			System.out.println("Line 3");
			str.toLowerCase();
			System.out.println("line 4");
			int numAsStr = Integer.parseInt(str);
			System.out.println("line 5");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");	
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("application continues");
		
		/*
		 * Exceptions are thrown through the "call stack" and
		 * can be caught at any level
		 */
		try {
			exceptionExample();
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException for a");
			e.printStackTrace();
		}
		
		try {
			methodA();
		} catch (CustomException e) {
			e.printStackTrace();
		}
		
		System.out.println("Last line of program");
		
	}
	
	private static void methodA() throws CustomException {
		customExceptionMethod();
	}
	
	private static void customExceptionMethod() throws CustomException {
		throw new CustomException("this is the message");
	}
	

	private static void exceptionExample() {
		try {
			exceptionLevel2();
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException from level 2");
		}
		
	}
	private static void exceptionLevel2() {
		exceptionLevel3();
	}
	private static void exceptionLevel3() {
		Integer.parseInt("a");
	}
	
	
	

}

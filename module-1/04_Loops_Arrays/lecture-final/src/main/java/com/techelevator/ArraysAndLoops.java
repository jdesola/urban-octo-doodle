package com.techelevator;

public class ArraysAndLoops {

	public static void main(String[] args) {
		
		String[] instructors = new String[5];
		instructors[0] = "John";
		instructors[2] = "Steve";
		instructors[1] = "Rachelle";
		instructors[3] = "Matt";
		
		String name = "Doug";
		instructors[1] = name;
		name = "Dave";
		
		System.out.println( "Hello, " + instructors[1]);
		
		instructors[4] = "Matty";
		
		//instructors[5] = "Katie";
		
		
		int[] numbers = new int[10];
		
		
		
		for ( int i = 0 ; i <= 10 ; i++ ) {
			
			System.out.println( i );
		}
		
		
		// Add all the numbers in a range
		int sum = 0;
		
		for ( int i = 100 ; i <= 241 ; i++) {
			if ( i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println( sum );
		
		int counter = 5;
		
		for ( ; counter  > 0; ) {
			System.out.println( counter );
			counter--;
		}
		
		for (int i = 0; i < instructors.length; i++) {
			System.out.println( instructors[i] );
		}
		
		int[] nums = { 10, 20, 30, 40, 50, 60, 70 };
		
		// Print out all the numbers in the array
		for ( int i = 0; i < nums.length; i++) {
			System.out.println( nums[i] );
		}
		
		
		// Print out all numbers in the array divisible by 3
		for ( int i = 0; i < nums.length; i++) {
			
			if ( nums[i] % 3 == 0) {
				System.out.println( nums[i] );
			}
		}
		
		// Print out every 3rd number in the array
		for ( int i = 0; i < nums.length; i = i + 3) {
			
			System.out.println( nums[i] );
			
		}

		// Print out every other
		for ( int i = 0; i < nums.length; i++) {
			
			if ( i % 2 == 0 ) {
				System.out.println( nums[i] );
			}
			
		}
		
		
		
		
		
	}

}

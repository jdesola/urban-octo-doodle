package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int num) {
		String fizzBuzzString = "";
		if (num % 3 == 0) {
			fizzBuzzString = "Fizz";
		}
		
		if (num % 5 == 0) {
			fizzBuzzString = "Buzz";
		}
		
		return fizzBuzzString;
	}

}

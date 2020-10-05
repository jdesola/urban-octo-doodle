package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(Integer num) {
		String fizzBuzzString = num.toString();
		if (num % 3 == 0) {
			fizzBuzzString = "Fizz";
		}
		
		if (num % 5 == 0) {
			fizzBuzzString = "Buzz";
		}
		
		if (num % 3 == 0 && num % 5 == 0) {
			fizzBuzzString = "FizzBuzz";
		}
		
		return fizzBuzzString;
	}

}

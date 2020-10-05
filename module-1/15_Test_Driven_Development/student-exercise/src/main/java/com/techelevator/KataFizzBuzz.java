package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(Integer num) {
		String fizzBuzzString = "";
				
		if (num % 3 == 0) {
			fizzBuzzString = "Fizz";
		} 
		if (num % 5 == 0) {
			fizzBuzzString = "Buzz";
		} 
		if (num % 3 == 0 && num % 5 == 0) {
			fizzBuzzString = "FizzBuzz";
		} 
		if (num >= 1 && num <= 100 && (num % 3 != 0 && num % 5 != 0)) {
			fizzBuzzString = num.toString();
		}
		if (num < 1) {
			fizzBuzzString = "";
		}
		if (num > 100) {
			fizzBuzzString = "";
		}
		
		return fizzBuzzString;
	}
}

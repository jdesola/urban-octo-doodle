package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int num) {
		String fizzBuzzString = "";
		if (num % 3 == 0) {
			fizzBuzzString = "Fizz";
		}
		return fizzBuzzString;
	}

}

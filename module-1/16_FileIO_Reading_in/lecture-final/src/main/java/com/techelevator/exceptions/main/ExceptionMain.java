package com.techelevator.exceptions.main;

import java.util.Scanner;

public class ExceptionMain {


	private static Scanner input = new Scanner( System.in );
	
	public static void main(String[] args) {
		int x = 0;
		
		while (x == 0) { 
			System.out.print("Number >>>");
			String userInput = input.nextLine();
			try {
				x = Integer.parseInt(userInput);
			} catch (NumberFormatException e) {
				System.out.println(userInput + " is not a number.  Please try again");
			}
		}
		
		System.out.println(x);
		
	}
}

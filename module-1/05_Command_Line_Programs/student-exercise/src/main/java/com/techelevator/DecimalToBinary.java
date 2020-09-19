package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in );
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		
		while (in.hasNextInt()) {
			int originalNumber = in.nextInt();
			int numberToConvertToBinary  = originalNumber;
			String binaryNumberString = "";
			while(numberToConvertToBinary >= 1) {
				binaryNumberString = Integer.toString((numberToConvertToBinary % 2)) + binaryNumberString;
				numberToConvertToBinary = numberToConvertToBinary / 2;
				}
			System.out.printf("%d in binary is %s%n", originalNumber, binaryNumberString);
	}

	}
	}

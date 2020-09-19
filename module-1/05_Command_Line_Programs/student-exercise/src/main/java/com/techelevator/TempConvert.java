package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner in = new Scanner ( System.in );
		System.out.print("Please enter the temperature: ");
		String userTempIn = in.nextLine();
		System.out.print("Is this temperature in Fahrenheit (1) or Celsius (2): ");
		String userTempTypeIn = in.nextLine();
		
		double userTemp = Double.parseDouble(userTempIn);
		double userTempType = Double.parseDouble(userTempTypeIn);
		
		if (userTempType == 1) {
			double convertedTempToC = (userTemp - 32) / 1.8;
			System.out.printf("%2.0fF is %2.0fC.%n", userTemp, convertedTempToC);
		} else if (userTempType == 2) {
			double convertedTempToF = (userTemp * 1.8) + 32;
			System.out.printf("%1.0fC is %1.0fF.%n", userTemp, convertedTempToF);
		} else {
			System.out.println("Sorry, that is not a valid type selection.");
		}
	}
}

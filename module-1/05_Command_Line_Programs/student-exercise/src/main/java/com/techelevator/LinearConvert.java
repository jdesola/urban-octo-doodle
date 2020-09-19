package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in );
		System.out.print("Please enter the length: ");
		String userMeasurementIn = in.nextLine();
		System.out.print("Is the measurement in Meters (1) or Feet (2): ");
		String userMeasurementTypeIn = in.nextLine();
		
		double userMeasurement = Double.parseDouble(userMeasurementIn);
		double userMeasurementType = Double.parseDouble(userMeasurementTypeIn);
		
		
		if (userMeasurementType == 1) {
			double convertedToFeet = userMeasurement * 3.2808399;
			System.out.printf("%1.0fm converts to %1.0ff.%n", userMeasurement, convertedToFeet);
		} else if (userMeasurementType == 2) {
			double convertedToMeters = userMeasurement * 0.3048;
			System.out.printf("%1.0ff converts to %1.0fm.%n", userMeasurement, convertedToMeters);
		} else {
			System.out.println("Sorry, that is not a valid type selection.");
		}
	}
}

package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) throws FileNotFoundException {
		HotelReservation testRes = new HotelReservation("Josh", 4);
		
		System.out.println(testRes.getName());
		
		System.out.println(testRes.getNumberOfNights());
		
		System.out.println(testRes.getEstimatedTotal());
		
		System.out.println(testRes.calculateTotal(false, false));
		
		System.out.println(testRes.calculateTotal(true, false));
		
		System.out.println(testRes.calculateTotal(false, true));
		
		System.out.println(testRes.calculateTotal(true, true));
		
		System.out.println(testRes);
		
		File resFile = new File( "/Users/student/Development/joshuadesola-java-blue-material/module-1/Assessment/data-files/HotelInput.csv" ); 
		
		List<HotelReservation> HotelReservations = new ArrayList<HotelReservation>();
		
		try ( Scanner fileReader = new Scanner(resFile) ) {
			while (fileReader.hasNextLine()) {
				String reservation = fileReader.nextLine();
				if (reservation.contains(", ") ) {
					reservation = reservation.replace(" ", "");
				}
				String[] parsedReservation = reservation.split(",");
				String reservationName = parsedReservation[0];
				int numberOfNights = Integer.parseInt(parsedReservation[1]);
				HotelReservations.add(new HotelReservation(reservationName, numberOfNights));
			}
		}
		
		double reservationTotal = 0.00;
		
		for (HotelReservation reservation : HotelReservations ) {
			reservationTotal += reservation.getEstimatedTotal();
		}
		
		System.out.printf("The total of all reservations is %s%2.2f", "$", reservationTotal);
	}

}

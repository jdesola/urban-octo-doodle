package com.techelevator;

import java.util.Scanner;

public class CatPackingCalculator {

	/*
	 *  1. Take Input 
	 *  2. Calculate Data (do some work)
	 *  3. Give Output
	 */
	
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner( System.in );
		
		
		for ( ; true ; ) {
		
			System.out.print("What is the length ");
			System.out.print("of the container in feet: ");
			String userInputLength = in.nextLine();	
			double containerLength =  Double.parseDouble( userInputLength );
		
			System.out.print("What is the height of the container: ");
			String userInputHeight = in.nextLine();
			double containerHeight = Double.parseDouble( userInputHeight );
			
			System.out.print("What is the width of the container: ");
			double containerWidth = in.nextDouble();
			in.nextLine();
			
			double containerVolume = containerLength * containerHeight * containerWidth;
			
			double volumeOfAverageHouseCat = 0.083;
			double estimatedPackingDensityOfAverageHouseCat = 0.5;
			
			double catsByVolume = containerVolume / volumeOfAverageHouseCat;
			double numberOfCats = catsByVolume * estimatedPackingDensityOfAverageHouseCat;
			
	
			System.out.println();
			
			System.out.printf("%-15s %-15s %-15s %-25s%n", "Height", "Width", "Length", "Cats in Box");
			System.out.println("---------------------------------------------------------------");
			System.out.printf(" %-14s  %-14s  %-14s %6.0f%n", containerHeight, containerWidth, containerLength, numberOfCats);
	
	//		System.out.print("Cats that will fit in box: ");
	//		System.out.printf("%4.0f", numberOfCats);
	//		System.out.printf("Cats that will fit in box: %4.0f", numberOfCats);
			
			System.out.println();
			System.out.println("(1) Calculate another container");
			System.out.println("(2) Quit");
			
			int choice = in.nextInt();
			in.nextLine();
			
			if (choice == 2) {
				break;
			}
			
			
		}
		
	}

}

package com.techelevator;

import java.io.*;

public class FizzWriter {

	public static void main(String[] args) throws IOException {
		
		String fizzNumString = "300";
		String fizzBuzzName = "FizzBuzz.txt";
		String fileName = fizzNumString + " " + fizzBuzzName;

		File fizzBuzzFile = new File(fileName);
		fizzBuzzFile.createNewFile();


		try (PrintWriter writer = new PrintWriter(fizzBuzzFile)) {
			for (Integer i = 1; i <= Integer.parseInt(fizzNumString); i++) {
				String fizzBuzz = "";
				if (i % 3 == 0) {
					fizzBuzz += "Fizz";
				} 
				if (i % 5 == 0) {
					fizzBuzz += "Buzz";
				} 
				if (!( i % 3 == 0) && !( i % 5 == 0)) {
					fizzBuzz = i.toString();
				}
				writer.println(fizzBuzz);
				writer.flush();
			}
		}
		System.out.println(fizzBuzzName + " has been created.");
	}

}

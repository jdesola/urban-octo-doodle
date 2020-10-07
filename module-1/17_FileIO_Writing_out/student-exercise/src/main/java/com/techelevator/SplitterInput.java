package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class SplitterInput {
	
	private static Scanner userInput = new Scanner( System.in );
	
	public static File getFilePathFromUser() {
		System.out.print("Where is the input file (please include the path to the file)? ");
		String pathToFile = userInput.nextLine();
		File fileToSplit = new File(pathToFile);
		return fileToSplit;
		
	}
	
	public static double getNumberOfLinesPerFileFromUser() {
			System.out.print("How many lines of text (max) should there be in the split files? ");
			double numberOfLinesPerFile = userInput.nextDouble();
			return numberOfLinesPerFile;
	}
}

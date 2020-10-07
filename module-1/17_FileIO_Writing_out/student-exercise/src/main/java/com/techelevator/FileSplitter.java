package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner ( System.in );



		System.out.print("Where is the input file (please include the path to the file)? ");
		String pathToFile = in.nextLine();
		System.out.print("How many lines of text (max) should there be in the split files? ");
		double linesOfText = in.nextDouble();

		File fileToSplit = new File( pathToFile );

		String fileName = fileToSplit.getName();

		String pathToSaveSplitFiles = fileToSplit.getAbsolutePath().replace(fileName, "");

		double lineCounter = 0;

		try ( Scanner fileReader = new Scanner ( fileToSplit ) ) {
			while ( fileReader.hasNextLine() ) {
				fileReader.nextLine();
				lineCounter++;
			}	
		}

		double numFilesCreated = Math.ceil( lineCounter / linesOfText );


		System.out.printf("The input file has %2.0f lines of text.", lineCounter);
		System.out.println();
		System.out.println();
		System.out.println("Each file that is created should have a sequential number assigned to it.");
		System.out.println();
		System.out.printf("For a %2.0f line input file \"%s\", this produces %2.0f output files.", lineCounter, fileName, numFilesCreated);
		System.out.println();
		System.out.println();
		System.out.println("**GENERATING OUTPUT**");
		System.out.println();

		try ( Scanner fileReader = new Scanner ( fileToSplit ) ) {
			if ( ( (int) lineCounter % (int) numFilesCreated == 0 ) && (((int) lineCounter / (int) numFilesCreated) % 2) != 0) {
				for (Integer i = 1; i <= numFilesCreated; i++) {
					String splitFileName = "input-" + i.toString() + ".txt";
					System.out.printf("Generating %s\n", splitFileName);
					File newFile = new File(pathToSaveSplitFiles, splitFileName);
					newFile.createNewFile();
					int j = 0;
					try (PrintWriter writer = new PrintWriter(newFile)) {
						while ( j < linesOfText ) {
							String lineToCopy = fileReader.nextLine();
							writer.println(lineToCopy);
							j++;
						}

					}
				}
			} else {
				for (Integer i = 1; i <= numFilesCreated - 1; i++) {
					String splitFileName = "input-" + i.toString() + ".txt";
					System.out.printf("Generating %s\n", splitFileName);
					File newFile = new File(pathToSaveSplitFiles, splitFileName);
					newFile.createNewFile();
					int j = 0;
					try (PrintWriter writer = new PrintWriter(newFile)) {
						while ( j < linesOfText ) {
							String lineToCopy = fileReader.nextLine();
							writer.println(lineToCopy);
							j++;
						}

					}
				} 
				String splitFileName = "input-" + (int) numFilesCreated + ".txt";
				System.out.printf("Generating %s\n", splitFileName);
				File newFile = new File(pathToSaveSplitFiles, splitFileName);
				newFile.createNewFile();
				String lineToCopy = fileReader.nextLine();
				while ( fileReader.hasNextLine() ) {
					try (PrintWriter writer = new PrintWriter(newFile)) {
						writer.println(lineToCopy);
						lineToCopy = fileReader.nextLine();
						writer.println(lineToCopy);
					}
				}
			}
		}
	}
}

package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the file that should be searched?");
		
		String filePath = in.nextLine();
		
		System.out.println("What is the search word you are looking for?");
		
		String searchWord = in.nextLine();
		
		File fileToSearch = new File( filePath );
		
		int lineNumber = 1;
		
			try(Scanner fileScanner = new Scanner( fileToSearch )) {
				while (fileScanner.hasNextLine()) {
					String lineToSearch = fileScanner.nextLine();
					if (lineToSearch.contains(searchWord)) {
						System.out.printf("%d) %s\n", lineNumber, lineToSearch);
					}
					lineNumber++;
				}
			} catch (FileNotFoundException ex){
				System.out.println("Cannot find file");
		}

	}

}

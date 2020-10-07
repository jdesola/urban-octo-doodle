package com.techelevator.filesplitter;

import java.io.File;
import java.util.Scanner;

public class Menu {

	private Scanner input = new Scanner( System.in );
	
	public File getFileNameFromUser() {
		
		File file = null;
		
		while (file == null) {
			System.out.print("File to split >>>");
			String filePath = input.nextLine();
			
			file = new File(filePath);
			
			if ( !file.exists() || !file.isFile() ) {
				file = null;
				System.out.println("Not a valid file");
			}
		}
		
		return file;
	}
	
	public int getNumberOfLinesFromUser() {
		int lines = 0;
		
		while (true) {
			System.out.print("Number of lines >>>");
			String userInput = input.nextLine();
			
			try {
				lines = Integer.parseInt( userInput );
				break;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid number");
			}
			
		}
		
		
		return lines;
	}
	
	public void displayFileError(String filename) {
		System.out.println(filename + " was not found");
	}
	
}

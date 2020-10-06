package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookReader {

	private static Scanner input = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		List<String> text = new ArrayList<String>();
		
		File book = null;
		while (book == null) {
			System.out.print("Path to file >>>");
			String filePath = input.nextLine();
			
			book = new File(filePath);
			
			if ( !book.exists() || !book.isFile() ) {
				System.out.println(book + " was not found");
				book = null;
			}
		}
		
		try ( Scanner bookScanner = new Scanner( book ) ) {
			
			while ( bookScanner.hasNextLine() ) {
				String line = bookScanner.nextLine();
				//System.out.println(line.toUpperCase());
				text.add(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(book + " was not found");
		}
		
		System.out.println("The 2118th line is: " + text.get(2117) );
		
	}
	
}

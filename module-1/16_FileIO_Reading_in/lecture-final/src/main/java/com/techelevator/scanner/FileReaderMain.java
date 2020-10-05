package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		String pathToFile = "/Users/student/Development/java-blue-material/module-1/16_FileIO_Reading_in/lecture-final/rtn_list.csv";
		
		/*
		 * A File object represents a file.
		 * A string with the path to the file is passed to its constructor.
		 */
		File file = new File(pathToFile);
		
		if ( file.exists() == false || file.isFile() == false ) {
			System.out.println("The file " + pathToFile + " is not valid");
		}
		
		/*
		 * try-with-resource:  when a object that is closable is instantiated in the () of a
		 * try, then it will be automatically closed and cleaned up when the try block ends, or
		 * if an exception is thrown.
		 */
		try ( Scanner fileScanner = new Scanner( file ) ) {
			
			while ( fileScanner.hasNextLine() ) {
				String thisIsTheNextLine = fileScanner.nextLine();
				System.out.println( thisIsTheNextLine );
			}
			
		}
		
	
	}

}

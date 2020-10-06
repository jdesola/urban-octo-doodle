package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritingDemo {

	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/student/Development/newdir/testFile_2";
		
		File file = new File(filePath);
		
		// Write to a file without buffering
		try (PrintWriter writer = new PrintWriter( file )) {
			
			for ( int i = 1; i <= 10; i++ ) {
				writer.println( i );
				
				/*
				 * Immediately flush the stream and write the file.
				 * Otherwise changes are backed up in the stream and written
				 * to the file when the Try-with-resource block ends, or the 
				 * stream becomes full. 
				 */
				writer.flush();
			}
		}
		
		
		// Write to a file with buffering
		
		try (PrintWriter printWriter = new PrintWriter(file);
				BufferedWriter buffered = new BufferedWriter(printWriter)) {
			
			for (int i = 1; i < 5; i++) {
				buffered.write("test\n");
			}
			
		}

	}

}

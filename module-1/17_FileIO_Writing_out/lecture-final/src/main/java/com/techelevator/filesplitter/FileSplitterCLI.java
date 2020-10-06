package com.techelevator.filesplitter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileSplitterCLI {

	public void run() {
		
		Menu menu = new Menu();
		FileSplitter splitter = new FileSplitter();
		
		File file = menu.getFileNameFromUser();
		int linesToSplit = menu.getNumberOfLinesFromUser();
		
		try {
			splitter.split(file, linesToSplit);
		} catch (IOException e) {
			menu.displayFileError(file.getAbsolutePath());
		} 
		
		System.out.println("Done");
	}
	
	
	public static void main(String[] args) {
		FileSplitterCLI splitter = new FileSplitterCLI();
		splitter.run();
	}

}

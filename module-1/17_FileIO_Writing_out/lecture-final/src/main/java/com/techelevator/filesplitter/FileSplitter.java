package com.techelevator.filesplitter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSplitter {

	public void split(File file, int linesToSplit) throws IOException {
		
		SegmentWriter segmentWriter = new SegmentWriter(file.getAbsolutePath());
		
		try (  Scanner fileScanner = new Scanner(file) ) {
			int segment = 0;
			while (fileScanner.hasNextLine()) {
				
				List<String> lines = new ArrayList<String>();
				int counter = linesToSplit;
				while (counter > 0 && fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					lines.add( line );
					counter--;
				}
				
				segment++;
				segmentWriter.write(lines, segment);
				
			}
		}
		
	}
}

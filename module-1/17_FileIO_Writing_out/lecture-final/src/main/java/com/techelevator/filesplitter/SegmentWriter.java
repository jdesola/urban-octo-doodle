package com.techelevator.filesplitter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SegmentWriter {

		private String filePath;
		
		public SegmentWriter(String filePath) {
			this.filePath = filePath;
		}
		
		public void write(List<String> lines, int segmentNumber) throws IOException {
			
			File outputFile = new File(filePath + "-" + segmentNumber);
			
			try ( PrintWriter writer = new PrintWriter(outputFile);
					BufferedWriter buffer = new BufferedWriter( writer )) {
				for (String line : lines) {
					buffer.write(line + System.getProperty("line.separator"));
				}
			}
			
			
		}
	
}

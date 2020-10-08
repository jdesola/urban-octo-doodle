package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.techelevator.items.Item;

public class ItemFileWriter {

	public void write(List<Item> items) throws IOException {
		File file = new File("sale.log");

		try ( PrintWriter printWriter = new PrintWriter( file );
				BufferedWriter buffer = new BufferedWriter( printWriter )) {

			buffer.write("Items sold:" + System.getProperty("line.separator"));

			for (Item item : items) {
				buffer.write( item.getName() + " - $" + item.getPrice() + System.getProperty("line.separator") );
			}

		}
	}

}

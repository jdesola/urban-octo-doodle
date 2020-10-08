package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.items.Candy;
import com.techelevator.items.Chip;
import com.techelevator.items.Drink;
import com.techelevator.items.Gum;
import com.techelevator.items.Item;

public class CsvFileReader {

	private String fileName;
	
	public CsvFileReader(String fileName) {
		this.fileName = fileName;
	}
	
	public Map<String, Item> read() throws FileNotFoundException {
		
		Map<String, Item> items = new HashMap<String, Item>();
		
		try ( Scanner fileScanner = new Scanner( new File(fileName) ) ) {
			
			while ( fileScanner.hasNextLine() ) {
				String line = fileScanner.nextLine();
				String[] parts = line.split("\\|");
				Item item = createItemFromParts(parts);
				items.put(parts[0], item);
			}
			
		}
		
		return items;
	}
	//A1|Potato Crisps|3.05|Chip   Candy   Drink  Gum
	
	private Item createItemFromParts(String[] parts) {
		
		String type = parts[3];
		String name = parts[1];
		double price = Double.parseDouble(parts[2]);
		
		Item item = null;
		if (type.equalsIgnoreCase("Chip")) {
			item = new Chip( name, price);
		} else if (type.equalsIgnoreCase("Candy")) {
			item = new Candy( name, price );
		} else if ( type.equalsIgnoreCase("Gum")) {
			item = new Gum( name, price );
		} else if ( type.equalsIgnoreCase("Drink")) {
			item = new Drink( name, price );
		}
		
		
		return item;
	}
	
}

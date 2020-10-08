package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techelevator.items.Item;
import com.techelevator.view.Menu;

public class VendingMachineCLI {
	private Menu menu;
	private CsvFileReader fileReader;
	private ItemFileWriter fileWriter;
	
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
		this.fileReader = new CsvFileReader("vendingmachine.csv");
		this.fileWriter = new ItemFileWriter();
	}

	public void run() throws IOException {
		
		Map<String, Item> items = fileReader.read();
		List<Item> cart = new ArrayList<Item>();
		
		while (true) {
			String key = menu.getKeyFromUser();
			if (key.equalsIgnoreCase("D")) {
				break;
			}
			Item selectedItem = items.get(key);
			if (selectedItem != null) {
				cart.add(selectedItem);
			}
		}
		
		fileWriter.write(cart);
		
	}

	public static void main(String[] args) throws IOException {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}

package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {

	private PrintWriter out;
	private Scanner in;

	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}
	
	public String getKeyFromUser() {
		out.println("Enter a key: ");
		out.flush();
		String key = in.nextLine();
		return key;
	}

	public String getKeyFromUser() {
		out.println("Enter a key: ");
		out.flush();
		String key = in.nextLine();
		return key;
	}
	

}

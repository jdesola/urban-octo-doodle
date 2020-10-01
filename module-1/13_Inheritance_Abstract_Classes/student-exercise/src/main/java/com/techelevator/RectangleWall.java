package com.techelevator;

public class RectangleWall extends Wall{
	private int length;
	private int height;
	
	// Constructor
	
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
	}
	
	
	// Getters
	
	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}


	// Overridden Methods
	
	@Override
	public int getArea() {
		return this.length * this.height;
	}
	
	@Override
	public String toString() {
		String dataToString = this.getName() + " (" + this.length + "x" + this.height + ") rectangle";
		return dataToString;
	}
}

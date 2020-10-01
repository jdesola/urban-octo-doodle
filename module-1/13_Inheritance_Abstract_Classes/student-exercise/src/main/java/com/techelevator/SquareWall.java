package com.techelevator;

public class SquareWall extends RectangleWall{
	// Constructor
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
	}
	
	// Overridden Methods
	public String toString() {
		String dataToString = this.getName() + " (" + this.getLength() + "x" + this.getHeight()	+ ") square";
		return dataToString;
	}
}

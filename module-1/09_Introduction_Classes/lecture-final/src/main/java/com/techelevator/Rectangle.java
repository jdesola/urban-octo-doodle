package com.techelevator;

public class Rectangle {

	private int height;
	private int width;

	// No Argument constructor
	public Rectangle() {
		
	}
	
	// Constructor with Arguments
	public Rectangle(int height, int width) {
		this.height = Math.abs(height);
		this.width = Math.abs(width);
	}
	
	// Constructor Overload
	public Rectangle(int width) {
		this.width = Math.abs(width);
	}
	
	// Derived Property
	public int getArea() {
		return this.height * this.width;
	}
	
	// Method
	public boolean isLargerThan(Rectangle other) {
		return this.getArea() > other.getArea();
	}
	
	// Method Overload
	public boolean isLargerThan( int height, int width ) {
		int otherArea = height * width;
		return this.getArea() > otherArea;
	}
	
	// Method Override 
	@Override
	public String toString() {
		// widthxHeight - # square feet
		return this.width + "x" + this.height + " - " + this.getArea() + " square feet";
	}
	
	@Override
	public boolean equals(Object obj) {
		// Cast the object to the this data type
		Rectangle other = (Rectangle) obj;
		return this.height == other.getHeight() && this.width == other.getWidth();
	}
	
	// Getters and Setters
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setHeight(int height) {
		this.height = Math.abs(height);
	}
	
	public void setWidth(int width) {
		this.width = Math.abs(width);
	}
	
}

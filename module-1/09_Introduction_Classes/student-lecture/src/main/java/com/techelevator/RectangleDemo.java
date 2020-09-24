package com.techelevator;

public class RectangleDemo {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setHeight(10);
		rectangle.setWidth(20);
		
		Rectangle rectangle2 = new Rectangle(7, -12);
		
		boolean isLarger = rectangle.isLargerThan(rectangle2);
		boolean isLarger2 = rectangle.isLargerThan(15, 17);
		
		System.out.println( rectangle );
		
		String s = rectangle.toString();
		
		Rectangle rect3 = new Rectangle(10, 20);
		
	}
	
}

package com.techelevator.shoppingcart;

public class ShoppingCart {
	
	// Data Members
	int totalNumberOfItems = 0;
	double totalAmountOwed = 0.0;
	
	// Getters
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	// Methods
	
	public double getAveragePricePerItem() {
		if ( this.totalAmountOwed != 0.0) {
			return this.totalAmountOwed / this.totalNumberOfItems;
		}
		return totalAmountOwed;
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
		this.totalNumberOfItems += numberOfItems;
		this.totalAmountOwed += ( numberOfItems * pricePerItem );
	}
	
	public void empty() {
		this.totalAmountOwed = 0.0;
		this.totalNumberOfItems = 0;
	}
	
}

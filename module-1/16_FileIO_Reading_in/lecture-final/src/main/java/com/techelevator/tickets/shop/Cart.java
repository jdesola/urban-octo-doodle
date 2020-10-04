package com.techelevator.tickets.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.techelevator.tickets.Item;

public class Cart {

	private List<Item> cartItems = new ArrayList<Item>();
	
	public void add(Item item) {
		cartItems.add( item );
	}
	
	public List<Item> getCartItems() {
		return this.cartItems;
	}
	
	public BigDecimal getTotal() {
		
		BigDecimal total = BigDecimal.ZERO;
		
		for (Item item : cartItems) {
			total = total.add(item.getTotalPrice());
		}
		
		return total;
	}
	
	public void clear() {
		cartItems = new ArrayList<Item>();
	}
	
	public int size() {
		return cartItems.size();
	}
}

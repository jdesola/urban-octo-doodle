package com.techelevator.tickets.shop;

import java.util.List;
import java.util.Scanner;

import com.techelevator.tickets.Item;

public class Store {

	private Scanner in = new Scanner( System.in );
	
	public void run() {
	
		Inventory inventory = new Inventory();
		Cart shoppingCart = new Cart();
		
		List<Item> items = inventory.get();
		
		while(true) {
			
			System.out.println("S) Select an Item");
			System.out.println("C) Checkout");
			System.out.print("Make selection >>>");
			
			String selection = in.nextLine();
			
			if (selection.equalsIgnoreCase("S")) {
				System.out.println();
				Item selectedItem = getUserSelection( items );
				shoppingCart.add( selectedItem );
			} else if (selection.equalsIgnoreCase("C")) {
				
				// Checkout
				
				// Show the items in the cart and their price
				// Show the total amount
				showCart( shoppingCart );
				
				// clear the cart
				shoppingCart.clear();
				
				break;
			} else {
				System.out.println("Invalid selection. Please try again!");
			}
			System.out.println();
		}
		
		
	}
	
	private void showCart(Cart cart) {
		System.out.println();
		
		System.out.println("You are purchasing " + cart.size() + " items:");
		for(Item item : cart.getCartItems()) {
			System.out.println(item.getName() + " $" + item.getTotalPrice());
		}
		
		System.out.println();
		
		System.out.println("Cart Total: $" + cart.getTotal() );
	}
	
	
	private Item getUserSelection(List<Item> items) {
		
		Item selected = null;
		
		while (selected == null) {
			for (int i = 0; i < items.size(); i++) {
				System.out.println("(" + (i + 1) + ") " 
							+ items.get(i).getName() 
							+ " $" + items.get(i).getTotalPrice());
				
				
			}
			
			System.out.print("Select a Product >>>");
			int choice = in.nextInt() - 1;
			in.nextLine();
			
			if (choice < items.size() ) {
				selected = items.get(choice);
			} else {
				System.out.println("Invalid choice, please try again");
				System.out.println();
			}
		}
		
		return selected;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Store store = new Store();
		store.run();
	}

}

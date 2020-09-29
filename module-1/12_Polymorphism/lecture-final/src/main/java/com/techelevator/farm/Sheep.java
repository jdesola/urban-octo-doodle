package com.techelevator.farm;

public class Sheep extends FarmAnimal implements Sellable, Milkable {

	public Sheep() {
		super("Sheep", "Baa");

	}

	@Override
	public int getPrice() {
		return 250;
	}

	@Override
	public void milk(int ounces) {
		System.out.println("Milk the Sheep");
		
	}

}

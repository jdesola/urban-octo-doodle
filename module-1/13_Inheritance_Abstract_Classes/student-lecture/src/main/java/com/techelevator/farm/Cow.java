package com.techelevator.farm;

public class Cow extends FarmAnimal implements Sellable, Milkable {

	public Cow() {
		super("Cow", "moo!");
	}

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public void milk(int ounces) {
		// TODO Auto-generated method stub
		System.out.println("Milk the cow");
		
	}

}
package com.techelevator.farm;

public class Horse extends FarmAnimal {

	public Horse() {
		super("Horse", "Neigh");
	}

	@Override
	public void eat() {
		System.out.println("The Horse eats...");
		
	}

}

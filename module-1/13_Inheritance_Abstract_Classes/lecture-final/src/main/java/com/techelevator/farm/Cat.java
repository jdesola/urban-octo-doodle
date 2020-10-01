package com.techelevator.farm;

/*
 * The final keyword when applied to a class
 * makes it so there can be no subclasses of
 * that class.
 */
public final class Cat extends FarmAnimal {

	public Cat() {
		super("Cat", "Meow");
	}

	@Override
	public void eat() {
		System.out.println("The Cat eats...");
		
	}
	
	
/*
 * getSound() is final in FarmAnimal, so 
 * it cannot be overridden.
 */
//	@Override
//	public String getSound() {
//		return "MEOW!!";
//	}

}

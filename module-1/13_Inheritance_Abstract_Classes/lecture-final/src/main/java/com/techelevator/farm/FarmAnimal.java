package com.techelevator.farm;

/*
 * An abstract class can be used as a superclass and its
 * methods inherited, but cannot be instantiated itself.
 * 
 * 
 */
public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isSleeping = false;
	
	
	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public abstract void eat();
	

	public String getName() {
		return name;
	}

	/*
	 *  The final keyword on a method makes it so the 
	 *  method cannot be Overridden by a subclass
	 */
	public final String getSound() {
		if (isSleeping) {
			return "Zzzz...";
		}
		return sound;
	}
	
	
	
	public boolean isSleeping() {
		return this.isSleeping;
	}
	
	public void sleep() {
		this.isSleeping = true;
	}
	
	public void wake() {
		this.isSleeping = false;
	}
	

}
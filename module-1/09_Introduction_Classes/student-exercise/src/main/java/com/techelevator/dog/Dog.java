package com.techelevator.dog;

public class Dog {
	
	//Data Members
	
	private boolean isSleeping;
	
	
	
	// Constructors
	
	public Dog() {
		this.isSleeping = false;
	}
	
	public Dog(boolean isAsleep) {
		this.isSleeping = isAsleep;
	}
	
	
	
	// Getter
	
	public boolean isSleeping() {
		return this.isSleeping;
	}
	
	
	// Methods
	
	public String makeSound() {
		if (this.isSleeping) {
			return "Zzzzz...";
		} else {
			return "Woof!";
		}
	}
	
	public void sleep() {
		this.isSleeping = true;
	}
	
	public void wakeUp() {
		this.isSleeping = false;
	}
}

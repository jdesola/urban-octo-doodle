package com.techelevator.dog;

public class Dog {

	private boolean isSleeping = false;

//	public Dog() {
//		this.isSleeping = false;
//	}
	
	public boolean isSleeping() {
		return isSleeping;
	}

	public String makeSound() {
		if (this.isSleeping == true) {
			return "Zzzzz...";
		} 
		return "Woof!";
	}

	public void sleep() {
		this.isSleeping = true;
	}
	
	public void wakeUp() {
		this.isSleeping = false;
	}
	
	
}

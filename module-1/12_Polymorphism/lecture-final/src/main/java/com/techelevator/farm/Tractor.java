package com.techelevator.farm;

public class Tractor implements Singable {

	public Tractor() {
	}

	@Override
	public String getSound() {
		return "Rrrrr";
	}
	
	@Override
	public String getName() {
		return "Tractor";
	}
	
}

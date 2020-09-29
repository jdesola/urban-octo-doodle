package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable[] farmAnimals = new Singable[] { new Cow(), new Chicken(), new Sheep(), new Tractor(), new Horse() };

		for (Singable animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
		
		
		System.out.println();
		
		
		Sellable[] items = new Sellable[] { new Cow(), new Chicken(), new Sheep() };
		
		for (Sellable item : items) {
			System.out.println("The " + item.getName() + " costs $" + item.getPrice());
			
			if (item instanceof Milkable) {
				Milkable itemAsMilkable = (Milkable) item;
				itemAsMilkable.milk(0);
			}
			
		}
		
		FarmAnimal[] animals = new FarmAnimal[] { new Sheep(), new Cow(), new Chicken() };
		
		Milkable[] milkables = new Milkable[] { new Sheep(), new Cow() };
		
		
		Sheep sheep = new Sheep();
		 //sheep has getName(), getSound(), getPrice(), milk(), eat()
		
		FarmAnimal sheepAsFarmAnimal = (FarmAnimal) sheep;
		// sheepAsFarmAnimal  getName(), getSound(), eat()
		
		
		Singable sheepAsSinglable = (Singable) sheep;
		//sheepAsSinglable getName(), getSound()
		
		Sellable sheepAsSellable = (Sellable) sheep;
		//sheepAsSellable getName() getPrice() 
		
		Milkable sheepAsMilkable = (Milkable) sheep;
		//sheepAsMilkable  milk()
		
		
	}
}
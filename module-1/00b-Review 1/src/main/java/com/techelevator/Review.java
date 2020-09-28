package com.techelevator;

public class Review {

	public static void main(String[] args) {
	
		
		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Fulton");
		person.setAge(40);
		
		Person person2 = new Person("Rachelle", "Rauh", 29);
	
		Person person3 = new Person("Steve", "Camichael");
		
		person.isAdult();
		
		person.getFullName();
		
		person.getFirstName();
		

	}

}

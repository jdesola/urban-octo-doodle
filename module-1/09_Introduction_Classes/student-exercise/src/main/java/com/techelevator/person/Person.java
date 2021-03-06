package com.techelevator.person;

public class Person {
	
	// Data Members
	
	private String firstName;
	private String lastName;
	private int age;
	
	// Getters and Setters
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Methods
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public boolean isAdult() {
		return this.age >= 18;
	}
	
	
}

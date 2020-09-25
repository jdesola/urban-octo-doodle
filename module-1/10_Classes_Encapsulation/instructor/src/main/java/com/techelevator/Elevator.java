package com.techelevator;

public class Elevator {

	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
	}
	
	public void openDoor() {
		this.doorOpen = true;
	}
	
	public void closeDoor() {
		this.doorOpen = false;
	}
    
	public void goUp(int desiredFloor) {
    	
		if (doorOpen == false && desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
			this.currentFloor = desiredFloor;
		}
		
		
    }
    
    public void goDown(int desiredFloor) {
    	
    }
	
	
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
	
	
}

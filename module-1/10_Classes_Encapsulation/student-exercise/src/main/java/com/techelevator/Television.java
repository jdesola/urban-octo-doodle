package com.techelevator;

public class Television {
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	// Getters
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	// Methods
	
	public void turnOff() {
		if ( this.isOn ) {
			this.isOn = false;
		}
	}
	
	public void turnOn() {
		if ( !(this.isOn) ) {
			this.isOn = true;
			this.currentChannel = 3;
			this.currentVolume = 2;
		}
	}
	
	public void changeChannel( int newChannel ) {
		if ( this.isOn ) {
			if ( newChannel  >= 3 && newChannel <= 18) {
				this.currentChannel = newChannel;
			}
		}
	}
	
	public void channelUp() {
		if ( this.isOn ) {
			if ( this.currentChannel >= 3 && this.currentChannel <= 17 ) {
				this.currentChannel++;
			} else {
				this.currentChannel = 3;
			}
		}
	}
	
	public void channelDown() {
		if ( this.isOn ) {
			if ( this.currentChannel > 3 && this.currentChannel <= 18 ) {
				this.currentChannel--;
			} else {
				this.currentChannel = 18;
			}
		}
	}
	
	public void raiseVolume() {
		if ( this.isOn ) {
			if ( this.currentVolume < 10 ) {
				this.currentVolume++;
			}
		}
	}
	
	public void lowerVolume() {
		if ( this.isOn ) { 
			if ( this.currentVolume > 0 ) {
				this.currentVolume--;
			}
		}
	}
	
	
}

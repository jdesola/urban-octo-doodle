package com.techelevator.parks.dao.states;

public class State {
	
	private String code;
	private String name;
	
	public State() {}
	
	public State(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

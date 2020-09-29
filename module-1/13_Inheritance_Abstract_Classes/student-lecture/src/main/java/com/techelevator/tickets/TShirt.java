package com.techelevator.tickets;

import java.math.BigDecimal;

public class TShirt implements Item {

	private String name;
	private int size;
	private String material;
	
	public TShirt(String name) {
		this.name = name;
	}
	
	@Override
	public BigDecimal getTotalPrice() {
		
		return new BigDecimal(25);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

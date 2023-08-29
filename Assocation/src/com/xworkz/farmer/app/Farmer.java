package com.xworkz.farmer.app;

public class Farmer {
	
	
	
	private String name;
	private Land land;
	
	public Farmer(String name) {
		this.name=name;
	}
	
	public void setland(Land land) {
		this.land=land;
	}
	
	public void farming() {
		System.out.println("Invoking farming In Farmer");
	}

}

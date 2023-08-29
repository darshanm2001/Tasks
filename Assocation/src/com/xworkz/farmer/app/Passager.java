package com.xworkz.farmer.app;

public class Passager {
	
	
	private String name;
	private Bus bus;
	
	
	public Passager(String name) {
		this.name=name;
	}
	
	public void setbus(Bus bus) {
		this.bus=bus;
	}
	public void waiting() {
		System.out.println("Invoking Passager  in bus");
		
	}

}

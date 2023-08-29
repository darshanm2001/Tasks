package com.xworkz.farmer.app;

public class Trainer {
	
	
	private String subject;
	private Laptop laptop;
	
	
	public Trainer(String subject) {
		this.subject=subject;
	}
	
	public void setlaptop(Laptop laptop) {
		this.laptop=laptop;
	}
	
	public void teaching() {
		System.out.println("Invoking teaching in Trainer");
		
	}
}

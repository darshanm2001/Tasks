package com.xworkz.asus;

public class Laptop {
	
	
	public void name() {
		System.out.println("Name of tha laptop");
		laptopGeneration();
		}
	
	
	public void laptopGeneration() {
		System.out.println("generation of the laptop");
		weight();
	}
	
	public void weight() {
		System.out.println("Weight of the laptop");
		try {
			memory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Exception event is handled");
		}	
		System.out.println("after handling");
	}
	
	public void memory() {
		System.out.println("memory of the laptop");	
		model();
	}
	
	
	public void model() {
		System.out.println("Model of the laptop");
		throw new NullPointerException();
	}

}

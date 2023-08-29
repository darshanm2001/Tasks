package com.xworkz.farmer.app;

public class Mobile {
	
	private String brand;
	private Charger charger;

	public Mobile(String brand) {
		this.brand = brand;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public void makeCall() {
		System.out.println("Making a call using mobile...");
	}

	public void sendMessage() {
		System.out.println("Sending a message using mobile...");
	}

	public void browseInternet() {
		System.out.println("Browsing the internet using mobile...");
	}

	public void playGame() {
		System.out.println("Playing a game on mobile...");
		
	}
}



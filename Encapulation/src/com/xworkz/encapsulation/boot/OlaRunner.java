package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.Ola;

public class OlaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("invoking Ola");
			Ola ola = new Ola();
			ola.setTransport("in bus");
			System.out.println("transport in " + ola.getTransport());
			ola.setSize("Long");
			System.out.println("Size is " + ola.getSize());
			ola.setAuto("Auto");
			System.out.println("Book  " + ola.getAuto());
			ola.setNoOfSeats(60);
			System.out.println("Total no of seats " + ola.getNoOfSeats());
			ola.setBike("Rapido");
			System.out.println("Total no of seats " + ola.getBike());
			ola.setTarget("Bangalore");
			System.out.println("Target is " + ola.getTarget());
			ola.setCar("Car");
			System.out.println("get booking in " + ola.getCar());
			ola.setOnlineBooking("online booking for reservation");
			System.out.println("get ticket booking in " + ola.getOnlineBooking());
			ola.setNoOfPassengers(60);
			System.out.println("Total no of Passenger " + ola.getNoOfPassengers());
			ola.setBetterRoads("For smooth traveling");
			System.out.println("Get betterr raods for " + ola.getBetterRoads());
			ola.setDistance(150);
			System.out.println("Total distance " + ola.getDistance());
			ola.setTotalAmount(500);
			System.out.println("Total amount " + ola.getTotalAmount());
			ola.setGoogleMap("Hassan to bangalore");
			System.out.println("Roots " + ola.getGoogleMap());
			System.out.println("\n");
	}

}

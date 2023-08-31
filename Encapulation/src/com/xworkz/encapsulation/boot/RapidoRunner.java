package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.Rapido;

public class RapidoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking Rapido");
		Rapido rapido=new Rapido();
		rapido.setTransport("in Bike");
		System.out.println("transport in "+rapido.getTransport());
		rapido.setSize("medium");
		System.out.println("Size is "+rapido.getSize());
		rapido.setElectric("Electric vehicle");
		System.out.println("Book  "+rapido.getlEectric());
		rapido.setNoOfSeats(4);
		System.out.println("Total no of seats "+rapido.getNoOfSeats());
		rapido.setBike("Rapido");
		System.out.println("Total no of seats "+rapido.getBike());
		rapido.setTarget("Bangalore");
		System.out.println("Target is "+rapido.getTarget());
		rapido.setScooty("Scooty");
		System.out.println("get booking in "+rapido.getScooty());
		rapido.setOnlineBooking("online booking for reservation");
		System.out.println("get ticket booking in "+rapido.getOnlineBooking());
		rapido.setNoOfPassengers(2);
		System.out.println("Total no of Passenger "+rapido.getNoOfPassengers());
		rapido.setBetterRoads("For smooth traveling");
		System.out.println("Get betterr raods for "+rapido.getBetterRoads());
		rapido.setDistance(10);
		System.out.println("Total distance "+rapido.getDistance());
		rapido.setTotalAmount(200);
		System.out.println("Total amount "+rapido.getTotalAmount());
		rapido.setGoogleMap("rajaji nagr to vijay nagar");
		System.out.println("Roots "+rapido.getGoogleMap());
		System.out.println("\n");
	}

}

package com.xworkz.farmer.boot;

import com.xworkz.farmer.app.Charger;
import com.xworkz.farmer.app.Mobile;

public class MobilrRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String brand = "Samsung";

		    Charger charger = new Charger();

		    Mobile mobile = new Mobile(brand);
		    System.out.println("Mobile brand: " + brand);
		    mobile.setCharger(charger);
		    mobile.browseInternet();
		    mobile.playGame();
		    mobile.sendMessage();
		    mobile.makeCall();
		}
	}



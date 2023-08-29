package com.xworkz.farmer.boot;

import com.xworkz.farmer.app.Laptop;
import com.xworkz.farmer.app.Laptop1;
import com.xworkz.farmer.app.Processor;

public class Laptop1Maker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brand = "Dell";

		Processor processor = new Processor();

		Laptop1 lap = new Laptop1(brand);
		System.out.println("Laptop brand: " + brand);
		lap.setProcessor(processor);
		lap.browseInternet();
		lap.turnOn();
		lap.watchMovie();
		lap.shutdown();
	}



	}



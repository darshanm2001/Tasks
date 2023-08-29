package com.xworkz.farmer.boot;

import com.xworkz.farmer.app.Farmer;
import com.xworkz.farmer.app.Land;

public class FarmerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="darshan";
		
		Land land=new Land();
		
		Farmer farmer=new Farmer(name);
		farmer.setland(land);
		farmer.farming();

	}

}

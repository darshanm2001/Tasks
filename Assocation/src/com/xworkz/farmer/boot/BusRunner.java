package com.xworkz.farmer.boot;

import com.xworkz.farmer.app.Bus;
import com.xworkz.farmer.app.Passager;

public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="KSRTC";
		
		Bus bus=new Bus();
		
		Passager passager=new Passager(name);
		passager.setbus(bus);
		passager.waiting();
		

	}

}

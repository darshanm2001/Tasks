package com.xworkz.runner;

import com.xworkz.app.Metro;
import com.xworkz.implemention.MetroImplemention;

public class MetroRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Metro metro=new MetroImplemention();
		metro.destination(null);
		metro.location(null);
		metro.moving(false);

	}

}

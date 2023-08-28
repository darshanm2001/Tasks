package com.xwork.runner;

import com.xworkz.app.RoomRule;
import com.xworkz.app.RoomSafe;
import com.xworkz.app.RoomSale;
import com.xworkz.implemention.RoomRoyal;

public class RoomRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in Room");
		
		RoomRule sale=new  RoomRoyal();
		sale.electricity();
		RoomSale sale1=new RoomRoyal();
		sale1.totalRooms();
		RoomSafe sale2=new RoomRoyal();
		sale2.electricity();
		sale2.totalRooms();
		RoomRoyal sale3=new RoomRoyal();
		sale3.electricity();
		
		

	}

}

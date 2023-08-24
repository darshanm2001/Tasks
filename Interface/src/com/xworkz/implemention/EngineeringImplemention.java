package com.xworkz.implemention;

import com.xworkz.app.Engineering;

public class EngineeringImplemention implements Engineering {

	@Override
	public int student(int noOfStudent) {
		System.out.println("invoking noOfstudent in Engineering");
		return 0;
	}

	@Override
	public String collegeName(String name) {
		System.out.println("invoking name in Engineering");
		return null;
	}

	@Override
	public int facality(int noOfFacility) {
		System.out.println("invoking noOfFacility in Engineering" );
		return 0;
	}

}

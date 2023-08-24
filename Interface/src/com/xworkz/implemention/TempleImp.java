package com.xworkz.implemention;

import com.xworkz.app.Temple;

public class TempleImp implements Temple {

	@Override
	public String templeName(String name) {
		System.out.println("invoking name in Temple" );
		return null;
	}

	@Override
	public String location(String temoleLocation) {
	System.out.println("invoking temoleLocation in Temple ");
		return null;
	}

	@Override
	public int noOfTemples(String temple) {
		System.out.println("invokiing noOFTemples in Temple");
		return 0;
	}

}

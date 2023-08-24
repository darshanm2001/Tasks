package com.xworkz.implemention;

import com.xworkz.app.Military;

public class Militarybase implements Military {

	@Override
	public void age(int minage) {
		System.out.println("invoking age in military");

	}

	@Override
	public String post(String name) {
		System.out.println("invoking name in militry");
		return null;
	}

	@Override
	public int noOfPost(int noOfVaccienece) {
		System.out.println("invoking vaccience in militry");
				return 0;
	}

}

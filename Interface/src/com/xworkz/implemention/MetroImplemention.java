package com.xworkz.implemention;

import com.xworkz.app.Metro;

public class MetroImplemention implements Metro {

	@Override
	public boolean moving(boolean movingMetro) {
		System.out.println("invoking movingMetro in metro");
		return false;
	}

	@Override
	public String location(String metroLocation) {
		System.out.println("invoking metroLocation in metro");
		return null;
	}

	@Override
	public String destination(String metroDestinition) {
		System.out.println("invoking metroDestinition in metro");
		return null;
	}

}

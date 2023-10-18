package com.xworkz.newspaper.app.util;

import java.util.Optional;

public class GarageRunner {

	public static void main(String[] args) {
		Optional<String> optional = GarageUtil.getName("Sachin", "Tendulkar");
		if (optional.isPresent()) {

			String ref = optional.get();
			System.out.println(ref);

		} else {
			System.out.println("optional is empty");
		}

	}

}

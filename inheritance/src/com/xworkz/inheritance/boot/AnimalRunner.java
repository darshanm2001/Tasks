package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.object.Lion;

public class AnimalRunner {

	public static void main(String[] args) {
		System.out.println("Runnnin main method");

		String lionName = "king";
		int noOfLions = 10;
		String name = "Lion";
		int noOfAnumals = 50;
		String location = "bandipura";

		Lion lion = new Lion(lionName, noOfLions, name, noOfAnumals, location);

		System.out.println(lion.aName);
		System.out.println(lion.animalNoOfAnimals);
		System.out.println(lion.location);
		System.out.println(lion.name);
		System.out.println(lion.noOfAnimals);

	}

}

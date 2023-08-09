package com.xworkz.inheritance.object;

public class Lion extends Animal {

	public String name;
	public int noOfAnimals;

	public Lion(String animalName, int noOfAnimals, String name, int animals, String location) {

		this.name = animalName;
		this.noOfAnimals = noOfAnimals;
		this.aName = animalName;
		this.animalNoOfAnimals = animals;
		this.location = location;

	}

	public void display() {
		System.out.println("Parent Animal Name" + aName);
		System.out.println("Parent no of animals" + animalNoOfAnimals);
		System.out.println("Parent Location" + location);
		System.out.println("Child Name" + name);
		System.out.println("Child No of animals" + noOfAnimals);

	}

}

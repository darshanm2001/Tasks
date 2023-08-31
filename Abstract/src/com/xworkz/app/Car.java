package com.xworkz.app;

public class Car extends Vehicle {

	public void fuelUp() {
		System.out.println("Car is fueled up.");
	}

	@Override
	public void drive() {
		System.out.println("Car is driving.");
	}

	@Override
	public void park() {
		System.out.println("Car is parked.");
	}

	@Override
	public void turnLeft() {
		System.out.println("Car is turning left.");
	}

	@Override
	public void turnRight() {
		System.out.println("Car is turning right.");
	}

	}



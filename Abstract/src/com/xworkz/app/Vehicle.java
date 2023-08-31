package com.xworkz.app;

public abstract class Vehicle {

	public void start() {
        System.out.println("Vehicle starting...");
    }

    public void stop() {
        System.out.println("Vehicle stopping...");
    }

    public void accelerate() {
        System.out.println("Vehicle accelerating...");
    }

    public void brake() {
        System.out.println("Vehicle braking...");
    }

    public void honk() {
        System.out.println("Vehicle honking...");
    }

    public abstract void fuelUp();

    public abstract void drive();

    public abstract void park();

    public abstract void turnLeft();

    public abstract void turnRight();
}


package com.xworkz.app;

public abstract class Road {
	public void start() {
        System.out.println("Road starting...");
    }

    public void stop() {
        System.out.println("Road stopping...");
    }

    public void accelerate() {
        System.out.println("Road accelerating...");
    }

    public void brake() {
        System.out.println("Road braking...");
    }

    public void honk() {
        System.out.println("Road honking...");
    }

    public abstract void turnLeft();

    public abstract void turnRight();

    public abstract void switchLane();

    public abstract void followTrafficRules();

    public abstract void maintainSpeed();


}

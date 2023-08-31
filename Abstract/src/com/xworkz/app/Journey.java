package com.xworkz.app;

public abstract class Journey {
	 public void start() {
	        System.out.println("Journey has started.");
	    }

	    public void stop() {
	        System.out.println("Journey has stopped.");
	    }

	    public void pause() {
	        System.out.println("Journey is paused.");
	    }

	    public void resume() {
	        System.out.println("Journey has resumed.");
	    }

	    public void end() {
	        System.out.println("Journey has ended.");
	    }

	    public abstract void performInitialize();
	    public abstract void executeStep();
	    public abstract void handleEvent();
	    public abstract void logProgress();
	    public abstract void finalizeJourney();
	}




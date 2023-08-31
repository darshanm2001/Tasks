package com.xworkz.app;

public class BegainsJourney extends Journey {

	// TODO Auto-generated constructor stub
	  @Override
	    public void performInitialize() {
	        System.out.println("performInitialize  of BegainsJourney .");
	    }

	    @Override
	    public void executeStep() {
	        System.out.println("executeStep of BegainsJourney.");
	    }

	    @Override
	    public void handleEvent() {
	        System.out.println("handleEvent of BegainsJourney.");
	    }

	    @Override
	    public void logProgress() {
	        System.out.println("logProgress of BegainsJourney.");
	    }

	    @Override
	    public void finalizeJourney() {
	        System.out.println("finalizeJourney of BegainsJourney.");
	    }
	}





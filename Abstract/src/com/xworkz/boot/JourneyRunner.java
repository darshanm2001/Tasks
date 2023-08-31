package com.xworkz.boot;

import com.xworkz.app.BegainsJourney;
import com.xworkz.app.Journey;

public class JourneyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Journey journey = new BegainsJourney();
        journey.start();
        journey.performInitialize();
        journey.pause();
        journey.executeStep();
        journey.resume();
        journey.handleEvent();
        journey.stop();
        journey.logProgress();
        journey.end();
        journey.finalizeJourney();
    }
	

	}



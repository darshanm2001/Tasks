package com.xworkz.boot;

import com.xworkz.app.ConcreteRoad;
import com.xworkz.app.Road;

public class RoadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Road road = new ConcreteRoad();
			road.start();
			road.accelerate();
			road.turnLeft();
			road.turnRight();
			road.switchLane();
			road.maintainSpeed();
			road.followTrafficRules();
			road.brake();
			road.honk();
			road.stop();

	}

}

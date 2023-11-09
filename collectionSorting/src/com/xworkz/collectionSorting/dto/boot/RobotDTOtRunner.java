package com.xworkz.collectionSorting.dto.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collectionSorting.dto.app.RobotDTO;

public class RobotDTOtRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in RobotDTORunner");

		RobotDTO robot1 = new RobotDTO("R2D2", 100, true, "Factory");
		RobotDTO robot2 = new RobotDTO("C-3PO", 120, false, "Tatooine");
		RobotDTO robot3 = new RobotDTO("Bender", 500, false, "New New York");
		RobotDTO robot4 = new RobotDTO("Wall-E", 200, true, "Earth");
		RobotDTO robot5 = new RobotDTO("Optimus Prime", 1500, false, "Cybertron");

		Collection<RobotDTO> robots = new LinkedList<RobotDTO>();
		robots.add(robot1);
		robots.add(robot2);
		robots.add(robot3);
		robots.add(robot4); 
		robots.add(robot5);

		robots.stream().sorted().forEach(p -> System.out.println(p));
	}
}

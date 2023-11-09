package com.xworkz.app.dto;

import java.util.ArrayList;
import java.util.Collection;

public class Actors {
	public static void main(String[] args) {
		Collection<String> actorNames = new ArrayList<>();
		actorNames.add("Chiyan Vikram");
		actorNames.add("Sudeep");
		actorNames.add("Yash");
		actorNames.add("Vijay");
		actorNames.add("Darshan");
		actorNames.add("Dulquer salman");
		actorNames.add("Akshay kumar");
		actorNames.add("Ajith");
		actorNames.add("Pruthviraj sukumaran");
		actorNames.add("Prajwal devraj");

		System.out.println("Total No.Of  Actors: " + actorNames.size());

		int count = 0;
		for (String ref : actorNames) {
			System.out.println("Name:" + ref);
			count++;
		}
		System.out.println("Total:" + count);

		System.out.println();
		Collection<String> actorNames1 = new ArrayList<>();
		actorNames1.add("Vishnuvardhan");
		actorNames1.add("Rajkumar");
		boolean sandalWood = actorNames.contains("Rajkumar");
		System.out.println("Contains sandalwood actor 'Rajkumar':" + sandalWood);

		System.out.println();
		Collection<String> actorNames2 = new ArrayList<>();
		actorNames2.add("Mammooty");
		actorNames2.add("Mohan Lal");
		boolean kollywood = actorNames2.containsAll(actorNames);
		System.out.println("Contains kollywood actor 'Mammooty' and 'MohanLal':" + kollywood);

		System.out.println();
		Collection<String> actorNames3 = new ArrayList<>();
		actorNames3.add("Ram pothineni");
		actorNames3.add("Amithab bacchan");
		boolean bollywood = actorNames3.remove("Rajkumar");
		System.out.println("Contains bollywood actor :" + bollywood);

		System.out.println();
		Collection<String> actorNames4 = new ArrayList<>();
		actorNames4.add("Chiranjeevi");
		actorNames4.add("Ravi Teja");
		boolean tollywood = actorNames4.removeAll(actorNames1);
		System.out.println("Contains tollywood actor :" + tollywood);

	}
}
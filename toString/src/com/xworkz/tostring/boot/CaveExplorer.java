package com.xworkz.tostring.boot;

import com.xworkz.tostring.app.Cave;

public class CaveExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    	System.out.println("Inovking main in CaveExplorer");
		        Cave cave1 = new Cave("Crystal Cavern", 5, 50.0, 30.0, 20,true, false, "Mountains", true, "A stunning cave with crystal formations.");
		        System.out.println(cave1);

		        Cave cave2 = new Cave("Dark Abyss", 3, 40.0, 25.0, 15.0,false, false, "Underground", false, "A mysterious and unexplored cave.");
		        System.out.println(cave2);

		        Cave cave3 = new Cave("Echoing Grotto", 8, 70.0, 40.0, 25.0,true, true, "Forest", true, "A cave known for its echoing acoustics.");
		        System.out.println(cave3);
		    }

}

	



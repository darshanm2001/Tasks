package com.xworkz.tostring.boot;

import com.xworkz.tostring.app.Pendant;

public class PendantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in Pendant Runner");
        
        Pendant pendant1 = new Pendant("Heart Pendant", "Gold", 20, 30, "https://www.heart-pendant.png", "Diamond", 1, "Gold Chain", true, "I Love You", "Red", 5.0);
        System.out.println(pendant1);

        Pendant pendant2 = new Pendant("Star Pendant", "Silver", 15, 15, "https://www.star-pendant.png","Sapphire", 1, "Silver Chain", false, "", "Blue", 2.5);
        System.out.println(pendant2);

        Pendant pendant3 = new Pendant("Cross Pendant", "Platinum", 25, 40, "https://www.cross-pendant.png","Emerald", 1, "Platinum Chain", true, "Faith", "Green", 4.0);
        System.out.println(pendant3);
    }
}


	



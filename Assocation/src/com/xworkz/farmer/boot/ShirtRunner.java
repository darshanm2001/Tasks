package com.xworkz.farmer.boot;

import com.xworkz.farmer.app.Button;
import com.xworkz.farmer.app.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String brand="Armani Exchange";
		
		Button noOfButton=new Button();
		
		Shirt shirt=new Shirt(brand);
		shirt.setnoOfButton(noOfButton);
		shirt.wear();

	}

}

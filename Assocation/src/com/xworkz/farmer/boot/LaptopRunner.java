package com.xworkz.farmer.boot;

import com.xworkz.farmer.app.Laptop;
import com.xworkz.farmer.app.Trainer;

public class LaptopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subject="Java";
		
		Laptop laptop=new Laptop();
		
		
		Trainer trainer=new Trainer(subject);
		trainer.setlaptop(laptop);
		trainer.teaching();
		

	}
	

}

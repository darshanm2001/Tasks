package com.xworkz.chandryan.boot;

import com.xworkz.chandryan.app.repositry.JuiceRepositry;
import com.xworkz.chandryan.app.repositry.JuiceRepositryImpl;
import com.xworkz.chandryan.app.service.JuiceService;
import com.xworkz.chandryan.app.service.JuiceServiceImpl;

public class JuiceRunner {


	public static void main(String[] args) {
		System.out.println("invoking in ServiceRunner");
		
		JuiceRepositry juiceRepositry=new JuiceRepositryImpl();
		
		JuiceService juiceService=new JuiceServiceImpl(juiceRepositry);
		
		juiceService.validateAndSave("Fanta");
		juiceService.validateAndSave("Fanta");

	}

}

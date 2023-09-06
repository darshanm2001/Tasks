package com.xworkz.chandryan.boot;

import com.xworkz.chandryan.app.repositry.TrainNoRepository;
import com.xworkz.chandryan.app.repositry.TrainNoRepositoryImpl;
import com.xworkz.chandryan.app.service.TrainNoService;
import com.xworkz.chandryan.app.service.TrainNoServiceImpl;

public class TrainNoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Invoking main in TrainRunner");
	        TrainNoRepository trainNoRepository = new TrainNoRepositoryImpl();

	        TrainNoService trainNoService = new TrainNoServiceImpl(trainNoRepository);
	        boolean ref = trainNoService.validateAndSave("65245");
	        System.out.println(ref);

	        boolean ref1 = trainNoService.validateAndSave("65345");
	        System.out.println(ref1);
	    }
	

	}



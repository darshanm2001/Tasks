package com.xworkz.chandryan.boot;

import com.xworkz.chandryan.app.repositry.PincodeRepository;
import com.xworkz.chandryan.app.repositry.PincodeRepositoryImpl;
import com.xworkz.chandryan.app.service.PincodeService;
import com.xworkz.chandryan.app.service.PincodeServiceImpl;

public class PincodeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Invoking main in PincodeRunner");
	        PincodeRepository pincodeRepository = new PincodeRepositoryImpl();

	        PincodeService pincodeService = new PincodeServiceImpl(pincodeRepository);
	        boolean ref = pincodeService.validateAndSave(560001);
	        System.out.println(ref);

	        boolean ref1 = pincodeService.validateAndSave(560001);
	        System.out.println(ref1);
	    }
	

	}



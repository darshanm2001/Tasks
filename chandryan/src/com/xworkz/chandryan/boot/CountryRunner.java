package com.xworkz.chandryan.boot;

import com.xworkz.chandryan.app.repositry.CountryRepository;
import com.xworkz.chandryan.app.repositry.CountryRepositoryImpl;
import com.xworkz.chandryan.app.service.CountryService;
import com.xworkz.chandryan.app.service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Invoking main in CountryRunner");
	        CountryRepository countryRepository = new CountryRepositoryImpl();

	        CountryService countryService = new CountryServiceImpl(countryRepository);
	        boolean ref = countryService.validateAndSave("India");
	        System.out.println(ref);

	        boolean ref1 = countryService.validateAndSave("India");
	        System.out.println(ref1);
	    }
	

	}



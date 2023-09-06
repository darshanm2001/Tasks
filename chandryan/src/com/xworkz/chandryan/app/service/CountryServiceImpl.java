package com.xworkz.chandryan.app.service;

import com.xworkz.chandryan.app.repositry.CountryRepository;

public class CountryServiceImpl implements CountryService {

	
	    private CountryRepository countryRepository;

	    public CountryServiceImpl(CountryRepository countryRepository) {
	        this.countryRepository = countryRepository;
	    }

	    @Override
	    public boolean validateAndSave(String countryName) {
	        System.out.println("Invoking validateAndSave in CountryServiceImpl");
	        if (countryName != null && !countryName.isEmpty() && countryName.length() >= 3 && countryName.length() <= 10) {
	            System.out.println("countryName is valid, then store countryName " + this.getClass().getSimpleName());
	            if (!this.countryRepository.isExist(countryName)) {
	                this.countryRepository.save(countryName);
	                return true;
	            } else {
	                System.err.println("CountryName " + countryName + " is already exist, please insert another");
	            }
	        } else {
	            System.err.println("Cannot store data, countryName is invalid");
	        }
	        return false;
	    }
	}

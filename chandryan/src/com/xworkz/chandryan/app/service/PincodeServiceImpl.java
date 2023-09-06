package com.xworkz.chandryan.app.service;

import com.xworkz.chandryan.app.repositry.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {
	 private PincodeRepository pincodeRepository;

	    public PincodeServiceImpl(PincodeRepository pincodeRepository) {
	        this.pincodeRepository = pincodeRepository;
	    }

	    @Override
	    public boolean validateAndSave(int pincode) {
	        System.out.println("Invoking validateAndSave in PincodeServiceImpl");
	        if (pincode >= 100000 && pincode <= 999999) {
	            System.out.println("Pincode is valid, then store pincode " + this.getClass().getSimpleName());
	            if (!this.pincodeRepository.isExist(pincode)) {
	                this.pincodeRepository.save(pincode);
	                return true;
	            } else {
	                System.err.println("Pincode " + pincode + " is already exist, please insert another");
	            }
	        } else {
	            System.err.println("Cannot store data, pincode is invalid");
	        }
	        return false;
	    }
	}



	
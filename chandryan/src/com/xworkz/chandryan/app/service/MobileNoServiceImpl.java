package com.xworkz.chandryan.app.service;

import com.xworkz.chandryan.app.repositry.MobileNoRepository;

public class MobileNoServiceImpl implements MobileNoService {

	 private MobileNoRepository mobileNoRepository;

	    public MobileNoServiceImpl(MobileNoRepository mobileNoRepository) {
	        this.mobileNoRepository = mobileNoRepository;
	    }

	    @Override
	    public boolean validateAndSave(long mobileNumber) {
	        System.out.println("Invoking validateAndSave in MobileNoServiceImpl");
	        if (isValidMobileNumber(mobileNumber)) {
	            if (!this.mobileNoRepository.isExist(mobileNumber)) {
	                this.mobileNoRepository.save(mobileNumber);
	                return true;
	            } else {
	                System.err.println("Mobile number " + mobileNumber + " is already exist, please insert another");
	            }
	        } else {
	            System.err.println("Cannot store data, mobile number is invalid");
	        }
	        return false;
	    }

	    private boolean isValidMobileNumber(long mobileNumber) {
	        return (String.valueOf(mobileNumber).length() == 10);
	    }
	}
package com.xworkz.chandryan.app.repositry;

public class MobileNoRepositoryImpl implements MobileNoRepository {

	 private long[] mobileNumbers = new long[TOTAL_MOBILE_NUMBERS];
	    int position;

	    @Override
	    public void save(long mobileNumber) {
	        System.out.println("Invoking save in MobileNoRepositoryImpl...");

	        if (this.position < TOTAL_MOBILE_NUMBERS) {
	            this.mobileNumbers[position] = mobileNumber;
	            System.out.println("Stored " + mobileNumber + " in position " + this.position);
	            this.position++;
	        } else {
	            System.err.println("Storage is Full, cannot store mobile number...");
	        }
	    }

	    @Override
	    public boolean isExist(long mobileNumber) {
	        for (int start = 0; start <= this.position; start++) {
	            long temp = this.mobileNumbers[start];
	            if (temp == mobileNumber) {
	                System.err.println("Mobile number " + mobileNumber + " is already exist");
	                return true;
	            }
	        }
	        return false;
	    }
	}
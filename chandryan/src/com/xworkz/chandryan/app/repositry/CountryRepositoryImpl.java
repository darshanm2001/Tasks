package com.xworkz.chandryan.app.repositry;

public class CountryRepositoryImpl implements CountryRepository {

	
	    private String[] countries = new String[TOTAL_COUNTRIES];
	    int position;

	    @Override
	    public void save(String countryName) {
	        System.out.println("Invoking save in CountryRepositoryImpl...");

	        if (this.position < TOTAL_COUNTRIES) {
	            this.countries[position] = countryName;
	            System.out.println("Stored " + countryName + " in position " + this.position);
	            this.position++;
	        } else {
	            System.err.println("Storage is Full, cannot store country...");
	        }
	    }

	    @Override
	    public boolean isExist(String countryName) {
	        for (int start = 0; start <= this.position; start++) {
	            String temp = this.countries[start];
	            if (temp != null && temp.equals(countryName)) {
	                System.err.println("CountryName is already exist");
	                return true;
	            }
	        }
	        return false;
	    }
	}
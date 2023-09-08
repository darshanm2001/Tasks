package com.xworkz.aadhar.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable {
	
	
	private  long aadharNumber;
	private String name;
	private String lastname;
	private long mobileNumber;
	
	
	public AadharDTO(double aadharNumber, String name, String lastname, double mobileNumber) {
		super();
		this.aadharNumber = (long) aadharNumber;
		this.name = name;
		this.lastname = lastname;
		this.mobileNumber = (long) mobileNumber;
	}
	
	


	@Override
	public String toString() {
		return "AadharDTO [aadharNumber=" + aadharNumber + ", name=" + name + ", lastname=" + lastname
				+ ", mobileNumber=" + mobileNumber + "]";
	}




	public double getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(double aadharNumber) {
		this.aadharNumber = (long) aadharNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public double getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = (long) mobileNumber;
	}
	
	
	
	
	



}

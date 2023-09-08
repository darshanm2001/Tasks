package com.xworkz.aadhar.app.dto;

import java.io.Serializable;

public class DoctorDTO implements Serializable{

	private String name;
	private String qualification;
	private int salary;
	private String type;
	
	
	public DoctorDTO(String name, String qualification, int salary, String type) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.salary = salary;
		this.type = type;
	}
	


	


	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", qualification=" + qualification + ", salary=" + salary + ", type=" + type +  "]";
	}






	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
}



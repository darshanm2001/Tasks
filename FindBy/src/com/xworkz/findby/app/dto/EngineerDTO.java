package com.xworkz.findby.app.dto;

import java.io.Serializable;

public class EngineerDTO implements Serializable{
	private int id;
	private String name;
	private String collegeName;
	
	
	
	public EngineerDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public EngineerDTO(int id, String name, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in EngineerDTO");
		if(obj!=null) {
			if(obj instanceof EngineerDTO) {
				EngineerDTO casted=(EngineerDTO)obj;
				if(this.collegeName.equals(casted.collegeName)&& this.name.equals(casted.name)) {
					System.out.println("Instance are same");
					return true;
				}
			}
		}
		return super.equals(obj);
	}



	@Override
	public String toString() {
		return "EngineerDRTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName +  "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCollegeName() {
		return collegeName;
	}



	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	
	

}

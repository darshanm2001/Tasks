package com.xworkz.aadhar.app.dto;

import java.io.Serializable;

public class PrinterDTO implements Serializable{

	private String name;
	private String model;
	private int modelNo;
	private int noOfColor;
	public PrinterDTO(String name, String model, int modelNo, int noOfColor) {
		super();
		this.name = name;
		this.model = model;
		this.modelNo = modelNo;
		this.noOfColor = noOfColor;
	}
	@Override
	public String toString() {
		return "PrinterDTO [name=" + name + ", model=" + model + ", modelNo=" + modelNo + ", noOfColor=" + noOfColor
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public int getNoOfColor() {
		return noOfColor;
	}
	public void setNoOfColor(int noOfColor) {
		this.noOfColor = noOfColor;
	}
	
	
}

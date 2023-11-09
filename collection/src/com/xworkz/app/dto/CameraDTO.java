package com.xworkz.app.dto;

import java.time.LocalDate;

public class CameraDTO {
	private int id;
	private String brand;
	private String model;
	private double cost;
	private LocalDate manufacturedDate;
	public CameraDTO() {
		super();
	}
	public CameraDTO(int id, String brand, String model, int cost, LocalDate manufacturedDate) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cost = cost;
		this.manufacturedDate = manufacturedDate;
	}
	@Override
	public String toString() {
		return "CameraDTO [id=" + id + ", brand=" + brand + ", model=" + model + ", cost=" + cost
				+ ", manufacturedDate=" + manufacturedDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = (int) (prime * result + cost);
		result = prime * result + id;
		result = prime * result + ((manufacturedDate == null) ? 0 : manufacturedDate.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CameraDTO other = (CameraDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cost != other.cost)
			return false;
		if (id != other.id)
			return false;
		if (manufacturedDate == null) {
			if (other.manufacturedDate != null)
				return false;
		} else if (!manufacturedDate.equals(other.manufacturedDate))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return (int) cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	
	
	
	
	
		
		
		
		
	}



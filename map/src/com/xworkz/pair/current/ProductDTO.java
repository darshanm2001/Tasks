package com.xworkz.pair.current;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductDTO implements Serializable,Comparable<ProductDTO>{
	
	private String name;
	private double price;
	private int id;
	private int quantity;
	private LocalDate mfDate;
	
	

	public ProductDTO() {
		super();
	}
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public LocalDate getMfDate() {
		return mfDate;
	}




	public void setMfDate(LocalDate mfDate) {
		this.mfDate = mfDate;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((mfDate == null) ? 0 : mfDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
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
		ProductDTO other = (ProductDTO) obj;
		if (id != other.id)
			return false;
		if (mfDate == null) {
			if (other.mfDate != null)
				return false;
		} else if (!mfDate.equals(other.mfDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", price=" + price + ", id=" + id + ", quantity=" + quantity + ", mfDate="
				+ mfDate + "]";
	}




	public ProductDTO(String name, double price, int id, int quantity, LocalDate mfDate) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
		this.quantity = quantity;
		this.mfDate = mfDate;
	}




	@Override
	public int compareTo(ProductDTO o) {
		
		return 0;
	}
	
	

}

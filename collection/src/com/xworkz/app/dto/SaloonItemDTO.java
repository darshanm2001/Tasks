package com.xworkz.app.dto;

import java.io.Serializable;

public class SaloonItemDTO  implements Serializable {
	private int id;
	private String name;
	private double price;
	private String usage;
	private boolean man;

	public SaloonItemDTO() {
	super();
	}

	public SaloonItemDTO(int id, String name, double price, String usage, boolean man) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.usage = usage;
	this.man = man;
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

	public double getPrice() {
	return price;
	}

	public void setPrice(double price) {
	this.price = price;
	}

	public String getUsage() {
	return usage;
	}

	public void setUsage(String usage) {
	this.usage = usage;
	}

	public boolean isMan() {
	return man;
	}

	public void setMan(boolean man) {
	this.man = man;
	}

	@Override
	public String toString() {
	return "SaloonItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", usage=" + usage + ", man=" + man
	+ "]";
	}

	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + (man ? 1231 : 1237);
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((usage == null) ? 0 : usage.hashCode());
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
	SaloonItemDTO other = (SaloonItemDTO) obj;
	if (id != other.id)
	return false;
	if (man != other.man)
	return false;
	if (name == null) {
	if (other.name != null)
	return false;
	} else if (!name.equals(other.name))
	return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
	return false;
	if (usage == null) {
	if (other.usage != null)
	return false;
	} else if (!usage.equals(other.usage))
	return false;
	return true;
	}

	}

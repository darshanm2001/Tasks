package com.xworkz.app.dto;

public class HotelDTO {
	private int id;
	private String name;
	private String ownerName;
	private  double gst;
	private String location;
	public HotelDTO() {
	super();
	}
	public HotelDTO(int id, String name, String ownerName, double gst, String location) {
	super();
	this.id = id;
	this.name = name;
	this.ownerName = ownerName;
	this.gst = gst;
	this.location = location;
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
	public String getOwnerName() {
	return ownerName;
	}
	public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
	}
	public double getGst() {
	return gst;
	}
	public void setGst(double gst) {
	this.gst = gst;
	}
	public String getLocation() {
	return location;
	}
	public void setLocation(String location) {
	this.location = location;
	}
	@Override
	public String toString() {
	return "HotelDTO [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", gst=" + gst + ", location="
	+ location + "]";
	}
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(gst);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + id;
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
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
	HotelDTO other = (HotelDTO) obj;
	if (Double.doubleToLongBits(gst) != Double.doubleToLongBits(other.gst))
	return false;
	if (id != other.id)
	return false;
	if (location == null) {
	if (other.location != null)
	return false;
	} else if (!location.equals(other.location))
	return false;
	if (name == null) {
	if (other.name != null)
	return false;
	} else if (!name.equals(other.name))
	return false;
	if (ownerName == null) {
	if (other.ownerName != null)
	return false;
	} else if (!ownerName.equals(other.ownerName))
	return false;
	return true;
	}


	}



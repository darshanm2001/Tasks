package com.xworkz.pair.current;

public class CompanyDTO {
	
	private String name;
	private String location;
	private String owner;
	private long gstNumber;
	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyDTO(String name, String location, String owner, long gstNumber) {
		super();
		this.name = name;
		this.location = location;
		this.owner = owner;
		this.gstNumber = gstNumber;
	}
	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", location=" + location + ", owner=" + owner + ", gstNumber=" + gstNumber
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (gstNumber ^ (gstNumber >>> 32));
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		CompanyDTO other = (CompanyDTO) obj;
		if (gstNumber != other.gstNumber)
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
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(long gstNumber) {
		this.gstNumber = gstNumber;
	}
	

}

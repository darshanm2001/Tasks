package com.xworkz.collectionSorting.dto.app;

import java.util.Comparator;

public class TheaterDto implements Comparable<TheaterDto> {
	
	private String name;
	private int capacity;
	private boolean inox;
	private String location;
	
	
	public TheaterDto(String name, int capacity, boolean inox, String location) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.inox = inox;
		this.location = location;
	}


	public TheaterDto() {
		super();
	}


	@Override
	public String toString() {
		return "TheaterDto [name=" + name + ", capacity=" + capacity + ", inox=" + inox + ", location=" + location
				+ "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public boolean isInox() {
		return inox;
	}


	public void setInox(boolean inox) {
		this.inox = inox;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + (inox ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		TheaterDto other = (TheaterDto) obj;
		if (capacity != other.capacity)
			return false;
		if (inox != other.inox)
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
		return true;
	}


	@Override
	public int compareTo(TheaterDto argument) {
		TheaterDto current=this;
		if(current.capacity==argument.capacity ) {
		return 1;
	}
		if(current.capacity>argument.capacity) {
			return 2000;
		}
		if(current.capacity<argument.capacity) {
			return -4;
		}
		return 0;
	}
}

	
	
	
	
	



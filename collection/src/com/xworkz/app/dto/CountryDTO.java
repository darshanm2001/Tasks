package com.xworkz.app.dto;


import java.time.LocalDate;

public class CountryDTO  {
	   private int id;
	   private String name;
	   private String capitalCity;
	   private long population;
	   private boolean independent;
	   private LocalDate independenceDate;
	   private int noOfStates;
	   private String primaryReligion;
	   private String nationalAnimal;
	   private String nationalBird;
	   private String nationalSport;
	   private String primeMinisterName;
	public CountryDTO() {
	super();
	}
	public CountryDTO(int id, String name, String capitalCity, long population, boolean independent,
	LocalDate independenceDate, int noOfStates, String primaryReligion, String nationalAnimal,
	String nationalBird, String nationalSport, String primeMinisterName) {
	super();
	this.id = id;
	this.name = name;
	this.capitalCity = capitalCity;
	this.population = population;
	this.independent = independent;
	this.independenceDate = independenceDate;
	this.noOfStates = noOfStates;
	this.primaryReligion = primaryReligion;
	this.nationalAnimal = nationalAnimal;
	this.nationalBird = nationalBird;
	this.nationalSport = nationalSport;
	this.primeMinisterName = primeMinisterName;
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
	public String getCapitalCity() {
	return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
	this.capitalCity = capitalCity;
	}
	public long getPopulation() {
	return population;
	}
	public void setPopulation(long population) {
	this.population = population;
	}
	public boolean isIndependent() {
	return independent;
	}
	public void setIndependent(boolean independent) {
	this.independent = independent;
	}
	public LocalDate getIndependenceDate() {
	return independenceDate;
	}
	public void setIndependenceDate(LocalDate independenceDate) {
	this.independenceDate = independenceDate;
	}
	public int getNoOfStates() {
	return noOfStates;
	}
	public void setNoOfStates(int noOfStates) {
	this.noOfStates = noOfStates;
	}
	public String getPrimaryReligion() {
	return primaryReligion;
	}
	public void setPrimaryReligion(String primaryReligion) {
	this.primaryReligion = primaryReligion;
	}
	public String getNationalAnimal() {
	return nationalAnimal;
	}
	public void setNationalAnimal(String nationalAnimal) {
	this.nationalAnimal = nationalAnimal;
	}
	public String getNationalBird() {
	return nationalBird;
	}
	public void setNationalBird(String nationalBird) {
	this.nationalBird = nationalBird;
	}
	public String getNationalSport() {
	return nationalSport;
	}
	public void setNationalSport(String nationalSport) {
	this.nationalSport = nationalSport;
	}
	public String getPrimeMinisterName() {
	return primeMinisterName;
	}
	public void setPrimeMinisterName(String primeMinisterName) {
	this.primeMinisterName = primeMinisterName;
	}
	@Override
	public String toString() {
	return "CountryDTO [id=" + id + ", name=" + name + ", capitalCity=" + capitalCity + ", population="
	+ population + ", independent=" + independent + ", independenceDate=" + independenceDate
	+ ", noOfStates=" + noOfStates + ", primaryReligion=" + primaryReligion + ", nationalAnimal="
	+ nationalAnimal + ", nationalBird=" + nationalBird + ", nationalSport=" + nationalSport
	+ ", primeMinisterName=" + primeMinisterName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitalCity == null) ? 0 : capitalCity.hashCode());
		result = prime * result + id;
		result = prime * result + ((independenceDate == null) ? 0 : independenceDate.hashCode());
		result = prime * result + (independent ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nationalAnimal == null) ? 0 : nationalAnimal.hashCode());
		result = prime * result + ((nationalBird == null) ? 0 : nationalBird.hashCode());
		result = prime * result + ((nationalSport == null) ? 0 : nationalSport.hashCode());
		result = prime * result + noOfStates;
		result = prime * result + (int) (population ^ (population >>> 32));
		result = prime * result + ((primaryReligion == null) ? 0 : primaryReligion.hashCode());
		result = prime * result + ((primeMinisterName == null) ? 0 : primeMinisterName.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (capitalCity == null) {
			if (other.capitalCity != null)
				return false;
		} else if (!capitalCity.equals(other.capitalCity))
			return false;
		if (id != other.id)
			return false;
		if (independenceDate == null) {
			if (other.independenceDate != null)
				return false;
		} else if (!independenceDate.equals(other.independenceDate))
			return false;
		if (independent != other.independent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nationalAnimal == null) {
			if (other.nationalAnimal != null)
				return false;
		} else if (!nationalAnimal.equals(other.nationalAnimal))
			return false;
		if (nationalBird == null) {
			if (other.nationalBird != null)
				return false;
		} else if (!nationalBird.equals(other.nationalBird))
			return false;
		if (nationalSport == null) {
			if (other.nationalSport != null)
				return false;
		} else if (!nationalSport.equals(other.nationalSport))
			return false;
		if (noOfStates != other.noOfStates)
			return false;
		if (population != other.population)
			return false;
		if (primaryReligion == null) {
			if (other.primaryReligion != null)
				return false;
		} else if (!primaryReligion.equals(other.primaryReligion))
			return false;
		if (primeMinisterName == null) {
			if (other.primeMinisterName != null)
				return false;
		} else if (!primeMinisterName.equals(other.primeMinisterName))
			return false;
		return true;
	}   
	   
	}
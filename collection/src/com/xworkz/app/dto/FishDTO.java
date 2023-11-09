package com.xworkz.app.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FishDTO {
	
	 private String name;
	    private byte age;
	    private short length;
	    private int weight;
	    private long population;
	    private float temperature;
	    private double depth;
	    private boolean isFreshwater;
	    private char category;
	    private LocalDate birthDate;
	    private LocalDateTime lastUpdated;
	    
	    
		public FishDTO() {
			super();
		}


		public FishDTO(String name, byte age, short length, int weight, long population, float temperature,
				double depth, boolean isFreshwater, char category, LocalDate birthDate, LocalDateTime lastUpdated) {
			super();
			this.name = name;
			this.age = age;
			this.length = length;
			this.weight = weight;
			this.population = population;
			this.temperature = temperature;
			this.depth = depth;
			this.isFreshwater = isFreshwater;
			this.category = category;
			this.birthDate = birthDate;
			this.lastUpdated = lastUpdated;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public byte getAge() {
			return age;
		}


		public void setAge(byte age) {
			this.age = age;
		}


		public short getLength() {
			return length;
		}


		public void setLength(short length) {
			this.length = length;
		}


		public int getWeight() {
			return weight;
		}


		public void setWeight(int weight) {
			this.weight = weight;
		}


		public long getPopulation() {
			return population;
		}


		public void setPopulation(long population) {
			this.population = population;
		}


		public float getTemperature() {
			return temperature;
		}


		public void setTemperature(float temperature) {
			this.temperature = temperature;
		}


		public double getDepth() {
			return depth;
		}


		public void setDepth(double depth) {
			this.depth = depth;
		}


		public boolean isFreshwater() {
			return isFreshwater;
		}


		public void setFreshwater(boolean isFreshwater) {
			this.isFreshwater = isFreshwater;
		}


		public char getCategory() {
			return category;
		}


		public void setCategory(char category) {
			this.category = category;
		}


		public LocalDate getBirthDate() {
			return birthDate;
		}


		public void setBirthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
		}


		public LocalDateTime getLastUpdated() {
			return lastUpdated;
		}


		public void setLastUpdated(LocalDateTime lastUpdated) {
			this.lastUpdated = lastUpdated;
		}
		
		


		@Override
		public String toString() {
			return "FishDTO [name=" + name + ", age=" + age + ", length=" + length + ", weight=" + weight
					+ ", population=" + population + ", temperature=" + temperature + ", depth=" + depth
					+ ", isFreshwater=" + isFreshwater + ", category=" + category + ", birthDate=" + birthDate
					+ ", lastUpdated=" + lastUpdated + "]";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
			result = prime * result + category;
			long temp;
			temp = Double.doubleToLongBits(depth);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + (isFreshwater ? 1231 : 1237);
			result = prime * result + ((lastUpdated == null) ? 0 : lastUpdated.hashCode());
			result = prime * result + length;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + (int) (population ^ (population >>> 32));
			result = prime * result + Float.floatToIntBits(temperature);
			result = prime * result + weight;
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
			FishDTO other = (FishDTO) obj;
			if (age != other.age)
				return false;
			if (birthDate == null) {
				if (other.birthDate != null)
					return false;
			} else if (!birthDate.equals(other.birthDate))
				return false;
			if (category != other.category)
				return false;
			if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
				return false;
			if (isFreshwater != other.isFreshwater)
				return false;
			if (lastUpdated == null) {
				if (other.lastUpdated != null)
					return false;
			} else if (!lastUpdated.equals(other.lastUpdated))
				return false;
			if (length != other.length)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (population != other.population)
				return false;
			if (Float.floatToIntBits(temperature) != Float.floatToIntBits(other.temperature))
				return false;
			if (weight != other.weight)
				return false;
			return true;
		}
		
		
	    
	    
	    
	    

}

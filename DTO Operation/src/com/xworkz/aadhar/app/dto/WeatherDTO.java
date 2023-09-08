package com.xworkz.aadhar.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {
	
	private String temp;
	private int humidity;
	private String visibilty;
	private String UV;
	
	public WeatherDTO(String temp, int humidity, String visibilty, String uV) {
		super();
		this.temp = temp;
		this.humidity = humidity;
		this.visibilty = visibilty;
		UV = uV;
	}

	@Override
	public String toString() {
		return "WeatherDTO [temp=" + temp + ", humidity=" + humidity + ", visibilty=" + visibilty + ", UV=" + UV + "]";
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public String getVisibilty() {
		return visibilty;
	}

	public void setVisibilty(String visibilty) {
		this.visibilty = visibilty;
	}

	public String getUV() {
		return UV;
	}

	public void setUV(String uV) {
		UV = uV;
	}
	
	
	
	
	
	
	
	

}


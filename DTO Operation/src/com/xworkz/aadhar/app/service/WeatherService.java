package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.WeatherDTO;

public interface WeatherService {
	default boolean validateAndSave(WeatherDTO dto) {
		System.out.println("Invoking validateAndSave in WeatherService");
		return false;
	
	}

}

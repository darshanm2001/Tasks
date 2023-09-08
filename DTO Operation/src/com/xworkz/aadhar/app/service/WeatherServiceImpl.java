package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.WeatherDTO;
import com.xworkz.aadhar.app.repositry.WeatherRepositry;


public class WeatherServiceImpl implements WeatherService {
	private WeatherRepositry weatherRepositry;

	public WeatherServiceImpl(WeatherRepositry weatherRepositry) {
		this.weatherRepositry = weatherRepositry;

	}

	@Override
	public boolean validateAndSave(WeatherDTO dto) {
		System.out.println("invoking validateAndsave in weatherimpl...");
		if (dto != null) {
			System.out.println("invoking validateAndsave in WeatherServiceImpl");
			this.weatherRepositry.save(dto);
			return true;
		} else {
			System.err.println("cannot store data ,dto is invalid");
		}
		return false;
	}
}

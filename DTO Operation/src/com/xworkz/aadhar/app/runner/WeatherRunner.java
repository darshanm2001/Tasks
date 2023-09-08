package com.xworkz.aadhar.app.runner;

import com.xworkz.aadhar.app.dto.WeatherDTO;
import com.xworkz.aadhar.app.repositry.WeatherRepositry;
import com.xworkz.aadhar.app.repositry.WeatherRepositryImpl;
import com.xworkz.aadhar.app.service.WeatherService;
import com.xworkz.aadhar.app.service.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {
		System.out.println("Running in main");
		
		WeatherRepositry repo =new WeatherRepositryImpl();
		WeatherService service=new WeatherServiceImpl(repo);
		WeatherDTO dto=new WeatherDTO("22c", 22, "8km","Veryweak");

	}

}

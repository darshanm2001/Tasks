package com.xworkz.aadhar.app.repositry;

import com.xworkz.aadhar.app.dto.WeatherDTO;

public interface WeatherRepositry {
	int TOTAL_ITEMS=20;
	void save(WeatherDTO dto);

}

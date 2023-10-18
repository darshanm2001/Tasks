package com.xworkz.findby.app.repositry;

import com.xworkz.findby.app.dto.ApplicationDTO;

public interface ApplicationRepositry {
	
	int TOTAL_ITEMS=5;
	void save(ApplicationDTO dto);
	
	default boolean isExist(ApplicationDTO dto) {
		return false;
	}
	
	default ApplicationDTO findbyName(String name) {
		return null;
	}
	ApplicationDTO findbyNameAndDevelopedBy(String name,String developedBy);

}

package com.xworkz.findby.app.service;

import com.xworkz.findby.app.dto.EngineerDTO;

public interface EngineerService {
	
	
	default boolean validateAndSave(EngineerDTO dto) {
		System.out.println("Invoking valdateAndSave in EngineerService");
		return false;
	}

}

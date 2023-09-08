package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.AadharDTO;

public interface AadharService {
	default boolean validateAndSave(AadharDTO dto) {
		System.out.println("Invoking validateAndSave in Service");
		return false;
	}

}

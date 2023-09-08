package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.PrinterDTO;

public interface PrinterService {
	
	default boolean validateAndSave(PrinterDTO dto) {
		System.out.println("Invoking validateAndSave in Service");
		return false;
	}
	

}

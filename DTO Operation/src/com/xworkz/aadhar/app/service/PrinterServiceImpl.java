package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.PrinterDTO;
import com.xworkz.aadhar.app.repositry.PrinterRepositry;

public class PrinterServiceImpl implements PrinterService {
	
	private PrinterRepositry prRepositry;
	
	public PrinterServiceImpl(PrinterRepositry pRepositry) {
		this.prRepositry=pRepositry;
	}
	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("invoking validateAndsave in PrinterServiceImpl");
		if(dto !=null) {
			System.out.println("dto is valid ,then store"+this.getClass().getSimpleName());
		this.prRepositry.save(dto);
		return true;
	}
		else {
			System.err.println("cannot store data ,dto is invalid");
			
		}
		
		return false;
	}

}

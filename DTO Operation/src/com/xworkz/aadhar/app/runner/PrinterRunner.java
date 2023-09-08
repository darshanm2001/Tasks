package com.xworkz.aadhar.app.runner;

import com.xworkz.aadhar.app.dto.PrinterDTO;
import com.xworkz.aadhar.app.repositry.PrinterRepositry;
import com.xworkz.aadhar.app.repositry.PrinterRepositryImpl;
import com.xworkz.aadhar.app.service.PrinterService;
import com.xworkz.aadhar.app.service.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {
		System.out.println("running in main");
		PrinterRepositry repo=new PrinterRepositryImpl();
		PrinterService service=new PrinterServiceImpl(repo);
		System.out.println("testing,,,");
		PrinterDTO dto =new PrinterDTO("Epson","Latest",1254,5);
		service.validateAndSave(dto);
	}

}

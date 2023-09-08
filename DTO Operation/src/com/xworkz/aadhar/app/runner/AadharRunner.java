package com.xworkz.aadhar.app.runner;

import com.xworkz.aadhar.app.dto.AadharDTO;
import com.xworkz.aadhar.app.repositry.AadharRepositry;
import com.xworkz.aadhar.app.repositry.AadharRepositryImpl;
import com.xworkz.aadhar.app.service.AadharService;
import com.xworkz.aadhar.app.service.AadharServiceImpl;

public class AadharRunner {

	public static void main(String[] args) {
		System.out.println("Invoking in main method");
		
		AadharRepositry repo=new AadharRepositryImpl();
		AadharService service=new AadharServiceImpl(repo);
		System.out.println("Testing...");
		AadharDTO dto =new AadharDTO(458234522, "darshan", "musale", 635247885);
		service.validateAndSave(dto);
		
		
	}

}

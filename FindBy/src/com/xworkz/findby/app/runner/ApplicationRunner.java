package com.xworkz.findby.app.runner;

import com.xworkz.findby.app.dto.ApplicationDTO;
import com.xworkz.findby.app.repositry.AplicationRepositryImpl;
import com.xworkz.findby.app.repositry.ApplicationRepositry;
import com.xworkz.findby.app.service.ApplicationService;
import com.xworkz.findby.app.service.ApplicationServiceImpl;

public class ApplicationRunner {

	public static void main(String[] args) {
		System.out.println("Running main in ApplicationRunner");
		
		ApplicationRepositry applicationRepositry =new AplicationRepositryImpl();
		ApplicationService service =new ApplicationServiceImpl(applicationRepositry);
		
		ApplicationDTO dto=new ApplicationDTO(1200,"darshan","Raman","IBM","New");
		boolean persisted =service.validateAndsave(dto);
		System.out.println("Persisted :" + persisted);
	}
}

			

	



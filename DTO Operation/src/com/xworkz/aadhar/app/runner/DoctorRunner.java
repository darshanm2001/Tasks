package com.xworkz.aadhar.app.runner;

import com.xworkz.aadhar.app.dto.DoctorDTO;
import com.xworkz.aadhar.app.repositry.DoctorRepositry;
import com.xworkz.aadhar.app.repositry.DoctorRepositryImpl;
import com.xworkz.aadhar.app.service.DoctorService;
import com.xworkz.aadhar.app.service.DoctorServiceImpl;

public class DoctorRunner {

	public static void main(String[] args) {
		System.out.println("Running on main");
		
		DoctorRepositry repo =new DoctorRepositryImpl();
		DoctorService service=new DoctorServiceImpl(repo);
		
		System.out.println("testing...");
		DoctorDTO dto=new DoctorDTO("Raman", "MBBS", 500000, "Surgeon");
		service.validateAndSave(dto);

	}

}

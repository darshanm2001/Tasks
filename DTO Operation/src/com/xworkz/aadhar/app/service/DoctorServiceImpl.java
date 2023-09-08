package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.DoctorDTO;
import com.xworkz.aadhar.app.repositry.DoctorRepositry;

public class DoctorServiceImpl implements DoctorService {
	
	private DoctorRepositry doctorRepositry;
	public DoctorServiceImpl(DoctorRepositry doctRepositry) {
		this.doctorRepositry=doctRepositry;
		
	}

	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		System.out.println("invoking validateAndSave in DoctorServiceImpl");
		if(dto !=null) {
			System.out.println("dto is valid,then store"+this.getClass().getPackageName());
			this.doctorRepositry.save(dto);
			return true;
		} 
		else {
			System.err.println("Cannot store data ,dto is invalid");
		}
		return false;
	}

	
		
	}



package com.xworkz.aadhar.app.repositry;

import com.xworkz.aadhar.app.dto.DoctorDTO;

public class DoctorRepositryImpl implements DoctorRepositry {
	
	private DoctorDTO[] dtos =new DoctorDTO[TOTAL_ITEMS];
	private int position;
	


	@Override
	public void save(DoctorDTO dto) {
		System.out.println("Running save in "+ this.getClass().getSimpleName());
		
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=dto;
			System.out.println(dto +"is at position"+this.position);
		}
		else {
			System.err.println("storage id full ,cannot store");
		}

	}

}

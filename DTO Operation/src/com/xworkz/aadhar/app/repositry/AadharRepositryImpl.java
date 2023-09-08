package com.xworkz.aadhar.app.repositry;

import com.xworkz.aadhar.app.dto.AadharDTO;

public class AadharRepositryImpl implements AadharRepositry {
	
	private AadharDTO[] dtos=new AadharDTO[TOTAL_ITEMS];
	private int position;
	
	
	@Override
	public void save(AadharDTO dto) {
		System.out.println("running save in "+ this.getClass().getSimpleName());
		
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=dto;
			System.out.println(dto + "is at position"+ this.position);
			this.position++;
		}
		else {
			
			System.err.println("storage is full ,annot store");
		}
		
	}
}

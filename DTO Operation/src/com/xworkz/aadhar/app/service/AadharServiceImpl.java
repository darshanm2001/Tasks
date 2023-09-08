package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.AadharDTO;
import com.xworkz.aadhar.app.repositry.AadharRepositry;

public class AadharServiceImpl implements AadharService {
	
	private AadharRepositry aadharRepositry;
	public AadharServiceImpl(AadharRepositry aadharRepositry) {
		this.aadharRepositry=aadharRepositry;
		
	}
	
	@Override
	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("invoking validateAndsave in AadharServiceImpl");
		if(dto !=null) {
			System.out.println("dto is valid ,then store" + this.getClass().getSimpleName());
			
			this.aadharRepositry.save(dto);
			return true;
			
		}
		else {
			System.err.println("cannot store data ,dto is invalid");
		}
		return false;
	}
	

}

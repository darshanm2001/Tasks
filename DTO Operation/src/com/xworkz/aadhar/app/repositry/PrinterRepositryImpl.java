package com.xworkz.aadhar.app.repositry;

import com.xworkz.aadhar.app.dto.PrinterDTO;

public class PrinterRepositryImpl implements PrinterRepositry {
	
	private PrinterDTO[] dtos =new PrinterDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(PrinterDTO dto) {
		System.out.println("running save in "+ this.getClass().getSimpleName());
		
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=dto;
			System.out.println(dto +" is at position" + this.position);
			this.position++;
		}
		else {
			System.err.println("storage is full ,cannot store");
		}

	}

}

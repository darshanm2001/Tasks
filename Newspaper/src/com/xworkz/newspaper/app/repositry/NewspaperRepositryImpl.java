package com.xworkz.newspaper.app.repositry;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public class NewspaperRepositryImpl implements NewspaperRepositry {
	
	private NewspaperDTO[] dtos=new NewspaperDTO[TOTAL_ITEMS];
	private int position;
	@Override
	public void save(NewspaperDTO dto) {
		System.out.println("running save in "+ this.getClass().getSimpleName());
		
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=dto;
			System.out.println(dto +"is at position "+this.position);
			this.position++;
		}
		else {
			System.err.println("Storage is Full,Cannot store");
		}
		
		
	}
	
	
	
	
	

}

package com.xworkz.findby.app.repositry;

import com.xworkz.findby.app.dto.EngineerDTO;

public class EngineerRepositryImpl implements EngineerReposotry {
	
	
	private EngineerDTO[] dtos= new EngineerDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(EngineerDTO dto) {
		System.out.println("running save in"+ this.getClass().getSimpleName());
		
		
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=dto;
			System.err.println(dto +"is at position "+this.position);
			this.position++;
		}
		else {
			System.err.println("Storage is Full,Cannot store");
		}

	}
	@Override
	public boolean isExist(EngineerDTO dto) {
		System.out.println("running is exist in" + this.getClass().getSimpleName());
		for(int index =0; index<=this.position; index++) {
			EngineerDTO ref =this.dtos[index];
			if(ref!=null && ref.equals(dto)) {
				System.out.println("dto is already exist");
				return true;
			}
		}
		return EngineerReposotry.super.isExist(dto);
	}

}

package com.xworkz.findby.app.repositry;

import com.xworkz.findby.app.dto.ApplicationDTO;

public class AplicationRepositryImpl implements ApplicationRepositry {
	
	private ApplicationDTO[] dtos=new ApplicationDTO[TOTAL_ITEMS];
	private int position;
	private ApplicationDTO dto;
	

	@Override
	public void save(ApplicationDTO dto) {
		System.out.println("invokinh save in ApplicationRepositryImpl");
		if(position<TOTAL_ITEMS) {
			this.dtos[position]=dto;
			System.out.println(dto + "is saved at position " +this.position);
			this.position++;
		}
		else {
			System.err.println("Storage Id full");
		}

	}

	@Override
	public boolean isExist(ApplicationDTO dto) {
		System.out.println("Running is exist in " + this.getClass().getSimpleName());
		for(int index=0; index<=this.position;index++) {
			ApplicationDTO ref =this.dtos[index];
			if(ref !=null && ref.equals(dto)) {
				System.out.println("dto already exist");
				return true;
			}
		}
		return ApplicationRepositry.super.isExist(dto);
		
	}
	@Override
	public ApplicationDTO findbyNameAndDevelopedBy(String name, String developedBy) {
		System.out.println("running fingbyName arg passed"+ name);
		System.out.println("current position"+ this.position);
		for(int index=0; index<this.position; index++) {
			dto=this.dtos[index];
			if(dto.getName().equals(name) && dto.getDevelopedBy().equals(developedBy)) {
				System.out.println("dto matched");
				return dto;
			}
		}
		System.out.println("No dto is matched");
		return ApplicationRepositry.super.findbyName(name);
	}

}

package com.xworkz.findby.app.service;

import com.xworkz.findby.app.dto.EngineerDTO;
import com.xworkz.findby.app.repositry.EngineerReposotry;

public class EngineerServiceImpl implements EngineerService {
	
	
	private EngineerReposotry engineerReposotry;
	public EngineerServiceImpl(EngineerReposotry engineerReposotry) {
		this.engineerReposotry=engineerReposotry;
	}
	
	@Override
	public boolean validateAndSave(EngineerDTO dto) {
		System.out.println("invoking validdateAndSave in EngineerServiceImpl");
		if(dto !=null) {
			System.out.println("dto is valid, then store " + this.getClass().getSimpleName());
			int id  =dto.getId();
			String name=dto.getName();
			String collegeName=dto.getCollegeName();
			
			if(name != null && !name.isEmpty() && name.length()>=5 && name.length()<=20) {
				System.out.println("name is valid");
			}else {
				System.err.println("name is not valid");
			}
			if(collegeName != null && !collegeName.isEmpty() && collegeName.length()>=5 && collegeName.length()<=20) {
				System.out.println("collegeName is valid");
			}else {
				System.err.println("Collegename is not valid");
			}
			if(id >0) {
				System.out.println("id is valid");
			}else {
				System.err.println("id is not valid");
			}
			if(!this.engineerReposotry.isExist(dto)) {
				System.out.println("isExist is already exist");
			}
			this.engineerReposotry.save(dto);
			return true;
		}
		else {
			System.out.println("dto is inavalid");
		}
		
		return false;
	}

	
}

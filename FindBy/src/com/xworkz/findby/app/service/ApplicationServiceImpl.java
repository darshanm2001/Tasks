package com.xworkz.findby.app.service;

import com.xworkz.findby.app.dto.ApplicationDTO;
import com.xworkz.findby.app.repositry.ApplicationRepositry;

public class ApplicationServiceImpl implements ApplicationService {
	
	private ApplicationRepositry applicationRepositry;
	
	public ApplicationServiceImpl(ApplicationRepositry applicationRepositry) {
		this.applicationRepositry=applicationRepositry;
	}

	@Override
	public boolean validateAndsave(ApplicationDTO dto) {
		System.out.println("invoking validate and save in ApplicationServiceImpl");
		if (dto != null) {
			System.out.println("dto is valid " + this.getClass().getSimpleName());
			int id = dto.getId();
			String name = dto.getName();
			String developedBy = dto.getDevelopedBy();
			String developedAt = dto.getDevelopedAt();
			String version = dto.getVersion();
			
			if (id > 0) {
				System.out.println("id is valid");
			} else {
				System.err.println("id is invalid");
			}
			
			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 20) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is not valid");
			}
			
			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() >= 3 && developedBy.length() <= 20) {
				System.out.println("developedBy is valid");

			} else {
				System.err.println("developedBy is not valid");
			}
			
			if (developedAt != null && !developedAt.isEmpty() && developedAt.length() >= 3 && developedAt.length() <= 20) {
				System.out.println("developedAt is valid");

			} else {
				System.err.println("developedAt is not valid");
			}
			
			if (version != null && !version.isEmpty() && version.length() >= 3 && version.length() <= 20) {
				System.out.println("version is valid");

			} else {
				System.err.println("version is not valid");
			}
			
			if(!this.applicationRepositry.isExist(dto)) {
				System.out.println("isExist are already exist");
				this.applicationRepositry.save(dto);
				return true;
			}else {
				System.err.println("not exist");
			}
			
		} else {
			System.err.println("dto is invalid");
		}


		return false;
	}


		
	}



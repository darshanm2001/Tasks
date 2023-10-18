package com.xworkz.findby.app.runner;

import com.xworkz.findby.app.dto.EngineerDTO;
import com.xworkz.findby.app.repositry.EngineerRepositryImpl;
import com.xworkz.findby.app.repositry.EngineerReposotry;
import com.xworkz.findby.app.service.EngineerService;
import com.xworkz.findby.app.service.EngineerServiceImpl;

public class EngineerRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main...");
		
		EngineerReposotry repo=new EngineerRepositryImpl();
		EngineerService service=new EngineerServiceImpl(repo);
		System.out.println("Testing....");
		
		EngineerDTO dto=new EngineerDTO(1000,"darshan","REC College");
		boolean persisted =service.validateAndSave(dto);
	}

}

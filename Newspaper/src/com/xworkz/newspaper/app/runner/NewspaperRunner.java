package com.xworkz.newspaper.app.runner;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.repositry.NewspaperRepositry;
import com.xworkz.newspaper.app.repositry.NewspaperRepositryImpl;
import com.xworkz.newspaper.app.service.NewspaperService;
import com.xworkz.newspaper.app.service.NewspaperServiceImpl;

public class NewspaperRunner {

	public static void main(String[] args) {
		System.out.println("invoking main");
		
		NewspaperRepositry repo=new NewspaperRepositryImpl();
		NewspaperService service= new NewspaperServiceImpl(repo);
		
        System.out.println("test");
		NewspaperDTO dto =new NewspaperDTO("TOI","ENG" , 1,4 );
	     service.validateAndSave(dto);

	}

}
 
package com.xworkz.app.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.ApplicationDTO;

public class ApplicationDTORunner {
	
	public static void main(String[] args) {
		
		 
		
	    LocalDate date=LocalDate.of(2001, 03, 16);
	    System.out.println(date);
		ApplicationDTO applicationDTO=new ApplicationDTO("Facebook", "14.6", "FB", date, 5.8);
		System.out.println(applicationDTO);
		ApplicationDTO applicationDTO1=new ApplicationDTO("Instagram", "1.6", "FB", date, 5);
		System.out.println(applicationDTO1);
		ApplicationDTO applicationDTO2=new ApplicationDTO("Whatsup", "10.0.6", "FB", date, 4.0);
		System.out.println(applicationDTO2);
		ApplicationDTO applicationDTO3=new ApplicationDTO("Twitter", "25.6", "Twitter", date, 3.5);
		System.out.println(applicationDTO3);
		ApplicationDTO applicationDTO4=new ApplicationDTO("Google", "1.0.2.6", "Google", date, 5);
		System.out.println(applicationDTO4);
		
		Collection <ApplicationDTO> collection = new ArrayList<>();
		collection.add(applicationDTO);
		collection.add(applicationDTO1);
		collection.add(applicationDTO2);
		collection.add(applicationDTO3);
		collection.add(applicationDTO4);
		
		System.out.println("TotalApplication: " + collection.size());
		
		 Iterator<ApplicationDTO> itr = collection.iterator();
		 while(itr.hasNext()) {
			 ApplicationDTO applicationName=itr.next();
			 System.out.println("Name :"+applicationName.getCompanyName());
			 System.out.println("Name :"+applicationName.getVersion());
			 System.out.println("Name :"+applicationName.getCreateDate());
		 }
		
		
	}
	

}


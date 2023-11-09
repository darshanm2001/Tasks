package com.xworkz.collectionSorting.dto.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collectionSorting.dto.app.TheaterDto;

public class TheaterDTORunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in TheaterDTORunner");
		
		TheaterDto dto =new TheaterDto("GT Mall", 1000, true, "magadi");
		TheaterDto dto1 =new TheaterDto("navrang", 1200, false, "rajajinagar");
		TheaterDto dto2 =new TheaterDto("laxmi", 500, false, "Hubli");
		TheaterDto dto3 =new TheaterDto("lulu mall", 2000, true, "rajajinagar");
		
		Collection<TheaterDto> theaters=new LinkedList<TheaterDto>();
		theaters.add(dto);
		theaters.add(dto1);
		theaters.add(dto2);
		theaters.add(dto3);
		
		for (TheaterDto theaterDto : theaters) {
			System.out.println(theaterDto);
		}
		
		System.out.println("==========");
		
		theaters.stream().sorted().forEach(p->System.out.println(p));
			
		}
	
	}



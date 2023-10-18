package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public interface NewspaperService {
	
	 default boolean validateAndSave(NewspaperDTO dto) {
		System.out.println("Invoking valdateAndSave in NewspaperService");
		return false;
	}

}

package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.repositry.NewspaperRepositry;

public class NewspaperServiceImpl implements NewspaperService {

	private NewspaperRepositry newspaperRepositry;

	public NewspaperServiceImpl(NewspaperRepositry newspaperRepositry) {
		this.newspaperRepositry = newspaperRepositry;
	}

	@Override
	public boolean validateAndSave(NewspaperDTO dto) {
		System.out.println("invoking validdateAndSave in NewspaperServiceImpl..");
		if (dto != null) {
			System.out.println("dto is valid, then store " + this.getClass().getSimpleName());
			this.newspaperRepositry.save(dto);
			return true;
		} else {
			System.err.println("Canoot store data ,dto is inavalid");
		}
		return false;
	}

}

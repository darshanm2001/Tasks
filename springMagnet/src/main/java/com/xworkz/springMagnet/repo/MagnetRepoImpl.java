package com.xworkz.springMagnet.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.springMagnet.dto.MagnetDTO;
@Repository
public class MagnetRepoImpl implements MagnetRepo {

	
	@Override
	public void save(MagnetDTO dto) {
		System.out.println("Invoking save in MagnetRepoImpl");
		System.out.println("DTO:"+dto);
	}

}

package com.xworkz.springMagnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springMagnet.dto.MagnetDTO;
import com.xworkz.springMagnet.repo.MagnetRepo;

@Service
public class MagnetServiceImpl implements MagnetService {
	@Autowired
	private MagnetRepo repo;

	@Override
	public boolean valiadteAndSave(MagnetDTO dto) {
		System.out.println("Invoking validateAndSave in MagnetServiceImpl,,.....");
		System.out.println("DTO:"+dto);
		this.repo.save(dto);
		return true;
	}

}

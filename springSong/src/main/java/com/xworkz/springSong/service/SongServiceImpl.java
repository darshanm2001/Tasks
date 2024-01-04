package com.xworkz.springSong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springSong.dto.SongDTO;
import com.xworkz.springSong.repo.SongRepo;

@Service
public class SongServiceImpl implements SongService {
	@Autowired
	private SongRepo repo;

	public SongServiceImpl() {
		System.out.println("Invoking SongServiceImpl");
	}

	@Override
	public boolean validateAndsave(SongDTO dto) {
		System.out.println("Invoking validateAndsave");
		System.out.println("DTO Passed" + dto);
		this.repo.save(dto);
		return true;

	}

}

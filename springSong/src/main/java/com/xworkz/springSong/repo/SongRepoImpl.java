package com.xworkz.springSong.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.springSong.dto.SongDTO;
@Repository
public class SongRepoImpl implements SongRepo {
	public SongRepoImpl() {
		System.out.println("invoking SongRepoImpl");
	} 

	@Override
	public void save(SongDTO dto) {
		System.out.println("invoking save");
		System.out.println("DTO Passed" + dto);

	}

}

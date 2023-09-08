package com.xworkz.aadhar.app.service;

import com.xworkz.aadhar.app.dto.DoctorDTO;

public interface DoctorService {
	default boolean validateAndSave(DoctorDTO  dto) {
		return false;
	}

}

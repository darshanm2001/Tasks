package com.xworkz.aadhar.app.repositry;

import com.xworkz.aadhar.app.dto.DoctorDTO;

public interface DoctorRepositry {
	int TOTAL_ITEMS=10;
	void save(DoctorDTO dto);

}

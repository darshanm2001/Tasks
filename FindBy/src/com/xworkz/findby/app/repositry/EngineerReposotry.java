package com.xworkz.findby.app.repositry;

import com.xworkz.findby.app.dto.EngineerDTO;

public interface EngineerReposotry {
	int TOTAL_ITEMS=5;
	void save(EngineerDTO dto);
	
	default boolean  isExist(EngineerDTO dto) {
	return false;

}
	default EngineerDTO findbyName(String name) {
		return null;
}
}
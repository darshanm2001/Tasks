package com.xworkz.newspaper.app.repositry;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public interface NewspaperRepositry {
	int TOTAL_ITEMS=5;
	void save(NewspaperDTO dto);

}

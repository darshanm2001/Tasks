package com.xworkz.chandryan.app.repositry;

public interface JuiceRepositry {
	int TOTAL_JUCIES=10;
	
	void save(String Juicename);
	
	default boolean isExist (String Juicename) {
		return false;
		
	}
}



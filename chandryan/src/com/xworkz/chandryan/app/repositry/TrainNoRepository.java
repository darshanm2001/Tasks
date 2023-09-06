package com.xworkz.chandryan.app.repositry;

public interface TrainNoRepository {
	  int TOTAL_TRAIN_NUMBERS = 10;

	    void save(String trainNumber);

	    default boolean isExist(String trainNumber) {
	        return false;
	    }
	

}

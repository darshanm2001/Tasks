package com.xworkz.chandryan.app.repositry;

public class TrainNoRepositoryImpl implements TrainNoRepository {

	 private String[] trainNumbers = new String[TOTAL_TRAIN_NUMBERS];
	    int position;

	    @Override
	    public void save(String trainNumber) {
	        System.out.println("Invoking save in TrainNoRepositoryImpl...");

	        if (this.position < TOTAL_TRAIN_NUMBERS) {
	            this.trainNumbers[position] = trainNumber;
	            System.out.println("Stored " + trainNumber + " in position " + this.position);
	            this.position++;
	        } else {
	            System.err.println("Storage is Full, cannot store train number...");
	        }
	    }

	    @Override
	    public boolean isExist(String trainNumber) {
	        for (int start = 0; start <= this.position; start++) {
	            String temp = this.trainNumbers[start];
	            if (temp != null && temp.equals(trainNumber)) {
	                System.err.println("Train number is already exist");
	                return true;
	            }
	        }
	        return false;
	    }
	}
	

	
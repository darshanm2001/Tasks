package com.xworkz.chandryan.app.service;

import com.xworkz.chandryan.app.repositry.TrainNoRepository;

public class TrainNoServiceImpl implements TrainNoService {

	private TrainNoRepository trainNoRepository;

    public TrainNoServiceImpl(TrainNoRepository trainNoRepository) {
        this.trainNoRepository = trainNoRepository;
    }

    @Override
    public boolean validateAndSave(String trainNo) {
        System.out.println("Invoking validateAndSave in TrainNoServiceImpl");
        if (trainNo != null && !trainNo.isEmpty() && trainNo.length() >= 3 && trainNo.length() <= 10) {
            System.out.println("Train number is valid, then store train number " + this.getClass().getSimpleName());
            if (!this.trainNoRepository.isExist(trainNo)) {
                this.trainNoRepository.save(trainNo);
                return true;
            } else {
                System.err.println("Train number " + trainNo + " is already exist, please insert another");
            }
        } else {
            System.err.println("Cannot store data, train number is invalid");
        }
        return false;
    }
}

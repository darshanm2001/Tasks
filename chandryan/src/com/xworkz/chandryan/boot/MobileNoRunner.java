package com.xworkz.chandryan.boot;

import com.xworkz.chandryan.app.repositry.MobileNoRepository;
import com.xworkz.chandryan.app.repositry.MobileNoRepositoryImpl;
import com.xworkz.chandryan.app.service.MobileNoService;
import com.xworkz.chandryan.app.service.MobileNoServiceImpl;

public class MobileNoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in MobileNoRunner");
        MobileNoRepository mobileNoRepository = new MobileNoRepositoryImpl();

        MobileNoService mobileNoService = new MobileNoServiceImpl(mobileNoRepository);
        boolean ref = mobileNoService.validateAndSave(1234567890L);
        System.out.println(ref);

        boolean ref1 = mobileNoService.validateAndSave(1234567890L);
        System.out.println(ref1);
    }


	}



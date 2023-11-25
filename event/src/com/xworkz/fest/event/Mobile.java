package com.xworkz.fest.event;

import java.net.BindException;

import com.xworkz.fest.exeption.DarshanException;
import com.xworkz.fest.exeption.DarshanRunTimeException;

public class Mobile {
	
	public void nokia() {
		System.out.println("Invoking in nokia");
		try {
			throw new DarshanRunTimeException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void samsung() throws DarshanException{
		System.out.println("invoking in samsung");
		throw new DarshanException();
	}

}
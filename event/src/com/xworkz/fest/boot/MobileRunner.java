package com.xworkz.fest.boot;

import java.net.BindException;

import com.xworkz.fest.event.Mobile;
import com.xworkz.fest.exeption.DarshanException;

public class MobileRunner {

	public static void main(String[] args) throws DarshanException {
		System.out.println("Invoking main in Mobile Runner");
		
		Mobile mobile=new Mobile();
		
		try {
			mobile.samsung();
			Class.forName("com.just.not.work");
		} catch (ClassNotFoundException e) {
			System.out.println("craeted"+ e.getMessage());
			e.printStackTrace();
		}
	}

}

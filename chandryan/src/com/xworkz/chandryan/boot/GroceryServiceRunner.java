package com.xworkz.chandryan.boot;

import com.xworkz.chandrayan.app.Impl.GroceryServiceImpl;
import com.xworkz.chandrayan.app.service.GroceryService;

public class GroceryServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in runner");
		GroceryService groceryservice=new GroceryServiceImpl(null);
		groceryservice.validateandsave("sugar");

	}

}

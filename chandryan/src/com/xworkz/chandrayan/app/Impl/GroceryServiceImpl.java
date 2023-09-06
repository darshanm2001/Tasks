package com.xworkz.chandrayan.app.Impl;

import com.xworkz.chandrayan.app.service.GroceryService;

public class GroceryServiceImpl implements GroceryService {
	private GroceryService groceryservice;
	
	
	@Override
	public boolean validateandsave(String grocery) {
		if(grocery!=null && !grocery.isEmpty()&& grocery.length()>3&& grocery.length()<=8) {
			System.out.println("Grocery is Available");
		}
		else {
			System.out.println("Grocery is Not Available");
		}
		
		return false;
	}
	
	public GroceryServiceImpl(GroceryService groceryservice) {
		this.groceryservice=groceryservice;
	}

}

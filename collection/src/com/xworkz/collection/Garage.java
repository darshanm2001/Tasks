package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Garage {
	
	 public static void main(String[] args) {
	        Collection<String> tools = new ArrayList<>();
	        tools.add("Piler");
	        tools.add("Spanner ");
	        tools.add("Hammer");
	        tools.add("Saw");
	        tools.add("Screw Driver");
	        tools.add("Jack");
	        tools.add("Cutter");
	        
	        System.out.println("Total :" + tools.size());
	        
	        Collection<String> tools1 = new ArrayList<>();
	        tools1.add("Flash Light");
	        tools1.add("Wrench");
	        
	        System.out.println(tools.containsAll(tools1));
	        

	        Collection<String> tools2 = new ArrayList<>();
	        tools1.add("Spanner ");
	        tools1.add("Screw");
	        
	        tools.addAll(tools2);
	        
	        boolean value=tools.removeAll(tools2);
	        System.out.println(value);
	        
	        
	        
		       
	        
	       

}
	    

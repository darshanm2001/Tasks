package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class States {
	
	 public static void main(String[] args) {
	        Collection<String> statesCollection = new ArrayList<>();
	        statesCollection.add("Andhra Pradesh");
	        statesCollection.add("Arunachal Pradesh");
	        statesCollection.add("Assam");
	        statesCollection.add("Bihar");
	        statesCollection.add("Chhattisgarh");
	        statesCollection.add("Goa");
	        statesCollection.add("Gujarat");
	        statesCollection.add("Haryana");
	        statesCollection.add("Himachal Pradesh");
	        statesCollection.add("Jharkhand");
	        statesCollection.add("Karnataka");
	        statesCollection.add("Kerala");
	        statesCollection.add("Madhya Pradesh");
	        statesCollection.add("Maharashtra");
	        statesCollection.add("Manipur");
	        statesCollection.add("Meghalaya");
	        statesCollection.add("Mizoram");
	        statesCollection.add("Nagaland");
	        statesCollection.add("Odisha");
	        statesCollection.add("Punjab");
	        statesCollection.add("Rajasthan");
	        statesCollection.add("Sikkim");
	        statesCollection.add("Tamil Nadu");
	        statesCollection.add("Telangana");
	        statesCollection.add("Tripura");
	        statesCollection.add("Uttar Pradesh");
	        statesCollection.add("Uttarakhand");
	        statesCollection.add("West Bengal");

	        System.out.println("Total Indian States: " + statesCollection.size());

	        Iterator<String> itr = statesCollection.iterator();
	        while (itr.hasNext()) {
	            String stateName = itr.next();
	            System.out.println("Name:"+stateName);
	        }
	    }
	}




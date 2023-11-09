package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Role {
	public static void main(String[] args) {
		
		Collection<String> roleCollection = new ArrayList<>();
		roleCollection.add("Software Engineering");
		roleCollection.add("Data Engineer");
		roleCollection.add("Manager");
		roleCollection.add("Data Engineer");
		roleCollection.add("Automation Tester");
		roleCollection.add("java deveolper");
		roleCollection.add("HR");
		roleCollection.add("Manuval Tester");
		
		
	  for (String role:roleCollection) {
		  if(role.endsWith("Tester")) {
			  System.out.println(role);
		  }
		
	}
	  

	  System.out.println("\\\\\\\\");
	  roleCollection.stream().filter((role)->role.endsWith("Tester")).forEach(r->System.out.println(r));
	    
	  System.out.println("\\\\\\\\");
	  roleCollection.stream().filter((role)->role.contains("r")).forEach(r1->System.out.println(r1));
	  
	  System.out.println("\\\\\\\\");
	  roleCollection.stream().filter(role->role.contains("m")).collect(Collectors.toList());
	  
	  
		  
	  }

		
	}
	
	
	



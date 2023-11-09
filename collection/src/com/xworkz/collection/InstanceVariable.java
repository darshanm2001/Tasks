package com.xworkz.collection;

public class InstanceVariable {
	
	 
	 
    public static String college ="ITS";
	
	 public String name() 
	    {  
	      System.out.println("running Static method ");
		return name();  
	    } 

		private static void staticDisplay() {
			
			
		}
	 
	 
	 
	 public static void main(String[] args) 
	    { 
		 InstanceVariable ref=new InstanceVariable();
		 ref.staticDisplay();
		 staticDisplay(); 
	 
}



}

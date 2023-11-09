package com.xworkz.collection;

	public class MyClass {
	   
	    public static int number=18;
	    public static String text="Virat";

	    public MyClass(int C, String text) {
	        this.number=number;
	        this.text = text;
	    }
	    
	    public MyClass(String text ,int C) {
	        this.text=text;
	        this.number=number;
	    }

	    
	   
	    

	    public static void main(String[] args) {
	        
	        MyClass myClass= new MyClass(16, "darshan");
	        System.out.println("number:" +number);
	        System.out.println("text:" +text);
	        
	        System.out.println("==========");
	        System.out.println("text:" +"Sudeep");
	        System.out.println("number:" +"50");
	        
	        
	        
	        
	        
	        

	       
	    }
	}

package com.xworkz.boot;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking string method in StringRunner");
		
		String string = new String();
		System.out.println("String chatAt() method");
		string = "Darshan";
		char store = string.charAt(2);
		System.out.println(store);
		
		System.out.println("\nString split() method");
		String input = "apple,banana,orange,grape";
		String[] fruits = input.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
        
		System.out.println("\nString split()overloaded method");
		String[] fruits1 = input.split("a", 5);
		for (int j = 0; j < fruits1.length; j++) {
			System.out.println(fruits1[j]);
		}
		System.out.println("\nString concat() method");
		String car="Nissan";
		String nissan=car.concat("GTR");
		System.out.println(nissan);
		
		System.out.println("\nString compareTo() method");
		String a="Anup";
	    int result=a.compareTo("Anoop");
		System.out.println(result);
		
		System.out.println("\nString substring()overloaded method");
		String gtr=car.substring(1, 3);
		System.out.println(gtr);
		
		System.out.println("\nString isEmpty  method");
		boolean res=string.isEmpty();
		System.out.println("isEmpty:"+res);
		
		System.out.println("\nString length() method");
		int res1=car.length();
		System.out.println("length:"+res1);
		
		System.out.println("\nString startsWith() method");
		boolean res2=nissan.startsWith("GTR");
		System.out.println(res2);
		

		System.out.println("\nString endsWith() method");
		boolean res3=nissan.endsWith("GTR");
		System.out.println(res3);
		
		System.out.println("\nString equalsIgnoreCase() method");
		boolean res4=car.equalsIgnoreCase("GTR");
		System.out.println(res4);
		
		System.out.println("\nString equals() method");
		boolean cricketer=string.equals("Virat Kohli");
		System.out.println(cricketer);
		
		System.out.println("\nString toUpperCase() method");
		String name="Prajwal L";
		String name1=name.toUpperCase();
		System.out.println(name1);
		
		System.out.println("\nString toLowerCase() method");
		String name2=name.toLowerCase();
		System.out.println(name2);
		
		System.out.println("\nString isBlank() method");
		String veg="";
		boolean veg1=veg.isBlank();
		System.out.println(veg1);
		
		System.out.println("\nString indexOf() method");
		int ref2=name.indexOf("r");
		System.out.println(ref2);
		
		System.out.println("\nString trim() method");
		String luxury=car.trim();
		System.out.println(luxury);
		
	    
				
				
		
		

	}

}

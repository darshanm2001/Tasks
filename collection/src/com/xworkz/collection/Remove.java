package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Remove {
	
public static void main(String[] args) {
		
		System.out.println("Running names in main...");
		
		Collection <String> darshan=new ArrayList();
		darshan.remove("darshan");
		darshan.remove("veersh");
		darshan.remove("anup");
		darshan.remove("raman");
		darshan.remove("vishal");
		

		System.out.println("The Size Of the array is :" +darshan.size());
		Iterator<String> itr=darshan.iterator();
		
		while(itr.hasNext())
		{
			String name = itr.next();
			System.out.println(name );
		}
		System.out.println("removing anup");
		darshan.remove("anup");
		Iterator<String> itr1=darshan.iterator();
		while(itr.hasNext())
		{
			String name1 = itr1.next();
			System.out.println(name1 );
		}
		Collection<String> collect=new ArrayList();
		
		
		
		
		
		
		
		

}
}

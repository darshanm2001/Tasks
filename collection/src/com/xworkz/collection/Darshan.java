package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Darshan {
	
	public static void main(String[] args) {
		
		System.out.println("Running names in main...");
		
		Collection <String> darshan=new ArrayList();
		darshan.add("darshan");
		darshan.add("veeresh") ;
		darshan.add("anup"); 
		darshan.add("raman");
		darshan.add("vishal");
		
		System.out.println("The Size Of the array is :" +darshan.size());
		Iterator<String> itr=darshan.iterator();
		
		while(itr.hasNext())
		{
			String name = itr.next();
			System.out.println(name );
		}
		System.out.println("The Size Of the array is :" +darshan.size());
		Iterator<String> itr4=darshan.iterator();
		
		while(itr4.hasNext())
		{
			String name = itr4.next();
			System.out.println(name );
		}
		System.out.println("removing anup");
		darshan.remove("anup");
		Iterator<String> itr1=darshan.iterator();
		while(itr1.hasNext())
		{
			String name1 = itr1.next();
			System.out.println(name1 );
		}
		
		
		Collection<String> collect=new ArrayList();
		collect.add("shubham");
		collect.add("vikas");
		darshan.addAll(collect);
		
		
		Iterator<String> itr2=darshan.iterator();
		System.out.println("First itr...");
		while(itr2.hasNext())
		{
			String name2 = itr2.next();
			System.out.println(name2 );
		}
		System.out.println("\n");
		
		System.out.println("removing all");
		darshan.removeAll(collect);
		System.out.println("RemoveAll");
		Iterator<String> itr3=darshan.iterator();
		while(itr3.hasNext())
		{
			String name3 = itr3.next();
			System.out.println(name3 );
		}
		System.out.println("\n");
		
		System.out.println(darshan.isEmpty());
		darshan.isEmpty();
		Iterator<String> itr6=darshan.iterator();
		while(itr6.hasNext())
		{
			String name6 = itr6.next();
			System.out.println(name6 );
		}
		
		System.out.println(darshan.isEmpty());
		darshan.isEmpty();
		Iterator<String> itr61=darshan.iterator();
		while(itr61.hasNext())
		{
			String name6 = itr61.next();
			System.out.println(name6 );
		}
		
		System.out.println(darshan.isEmpty());
		darshan.clear();
		System.out.println(darshan.isEmpty());
		Iterator<String> itr9=darshan.iterator();
		System.out.println("After clear..");
		while(itr9.hasNext())
		{
			String name9 = itr9.next();
			System.out.println(name9 );
		}
		
		
		
		
		
		
		
		

}
}

package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Festivals {
	 public static void main(String[] args) {

	        Collection<String> festivals = new ArrayList<>();
	        festivals.add("Diwali");
	        festivals.add("Christmas");
	        festivals.add("Holi");
	        festivals.add("Eid");
	        festivals.add("Thanksgiving");
	        festivals.add("New Year");
	        festivals.add("Easter");
	        festivals.add("Ram Navami");
	        festivals.add("Navratri");
	        festivals.add("Makar Sankranti");
	        festivals.add("Zumba Fest");
	        festivals.add("Pongal");
	        festivals.add("Ganesh Chaturthi");
	        festivals.add("Raksha Bandhan");
	        festivals.add("Onam");

	        System.out.println("Total Number of Festivals: " + festivals.size());
	        System.out.println("=============================");

	        System.out.println("Elements with more than 6 characters....");
	        festivals.stream().filter(festival -> festival.length() > 6).forEach(System.out::println);
	        System.out.println("=============================");

	        System.out.println("Elements with less than 6 characters....");
	        List<String> lessThan6Chars = festivals.stream().filter(festival -> festival.length() < 6).collect(Collectors.toList());
	        lessThan6Chars.forEach(System.out::println);
	        System.out.println("=============================");

	        System.out.println("List elements contains 'O' and 'o' characters....");
	        List<String> containingO = festivals.stream().filter(festival -> festival.contains("o") || festival.contains("O")).collect(Collectors.toList());
	        containingO.forEach(System.out::println);
	        System.out.println("=============================");

	        System.out.println("List elements not contains 'g' character....");
	        List<String> containingg = festivals.stream().filter(festival -> !festival.contains("g")).collect(Collectors.toList());
	        containingg.forEach(System.out::println);
	        System.out.println("=============================");

	        System.out.println("List elements contains 's' and 'S' characters....");
	        festivals.stream().filter(festival -> festival.endsWith("s") || festival.endsWith("S")).forEach(System.out::println);
	        System.out.println("=============================");

	        System.out.println("List elements contains 'Z' and 'R' characters....");
	        List<String> containing12 = festivals.stream().filter(festival -> festival.contains("Z") || festival.contains("R")).collect(Collectors.toList());
	        containing12.forEach(System.out::println);
	        System.out.println("=============================");

	        System.out.println("List elements contains 'Ram' characters....");
	        List<String> containingRam = festivals.stream().filter(festival -> festival.contains("Ram") || festival.contains("ram")).collect(Collectors.toList());
	        containingRam.forEach(System.out::println);
	    }
	}

	
	

	       
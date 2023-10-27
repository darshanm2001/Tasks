package com.xworkz.collection;

public class Company {
	
	public static void main(String[] args) {
		
System.out.println("Running main in company names...");

String infosys  ="Infosys";
String wipro ="Wipro";
String tcs   ="Tcs";
String cognizant ="Cognizant";
String capgemini   ="Capgemini";
String dell  ="dell";
String lenovo="Lenovo";

String companies[]={infosys,wipro,tcs,cognizant,capgemini,dell,lenovo};
for (int List=0;List<companies.length;List++)
System.out.println("Company " +companies[List]+ " is at position " +List);

companies[5]="Societe Generale";
String temp=companies[5];
System.out.println("\n");


for (int List=companies.length-1;List>=0;List--)
System.out.println("companies " +companies[List]+ " is at position" +List);
}
}
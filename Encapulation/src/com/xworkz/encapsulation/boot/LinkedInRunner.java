package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.LinkedIn;

public class LinkedInRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking LinkedIn");
		LinkedIn linkedIn = new LinkedIn();
		linkedIn.setType("Professional network");
		linkedIn.setAvailableIn("Multikingual");
		linkedIn.setFounded("May 5,2003");
		linkedIn.setHeadquarters("Sunnyvale,California,U.S");
		linkedIn.setAreaServed("Worldwide");
		linkedIn.setFounders("Reid Hoffman, Eric Ly");
		linkedIn.setCeo("Ryan Roslansky");
		linkedIn.setKeyPeople("Melissa Selcher,Raghu Hiremagaluru,James chuong");
		linkedIn.setIndustry("Internet");
		linkedIn.setRevenue(13.82);
		linkedIn.setParent("Microsoft");
		linkedIn.setUrl("www.linkedin.com");
		linkedIn.setreRistration("Required");
		linkedIn.setUsers(930);
		System.out.println("type is :" + linkedIn.getType());
		System.out.println("type is :" + linkedIn.getAvailableIn());
		System.out.println("Founded in :" + linkedIn.getFounded());
		System.out.println("Headquarters in :" + linkedIn.getHeadquarters());
		System.out.println("AreaServed :" + linkedIn.getAreaServed());
		System.out.println("Founders are :" + linkedIn.getFounders());
		System.out.println("Ceo is :" + linkedIn.getCeo());
		System.out.println("key people is :" + linkedIn.getKeyPeople());
		System.out.println("industry is :" + linkedIn.getIndustry());
		System.out.println("Revenue in crors :" + linkedIn.getRevenue());
		System.out.println("Parent is :" + linkedIn.getParent());
		System.out.println("Url is :" + linkedIn.getUrl());
		System.out.println("Registration is :" + linkedIn.getRegistration());
		System.out.println("Users is :" + linkedIn.getUsers());
		System.out.println("\n");

	}

}

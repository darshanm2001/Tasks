package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.FaceBook;

public class FacebookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking FaceBook");
		FaceBook faceBook = new FaceBook();
		faceBook.setType("Social networking");
		faceBook.setAvailableInLanguages(112);
		faceBook.setListOfLanguages("kannada,English,Hindi,Tamil,Telgu etc");
		faceBook.setFounded("Feb 4,2004");
		faceBook.setAreaServed("Worldwide,except blocking countries");
		faceBook.setOwner("Meta Platforms");
		faceBook.setFounders("Mark Zuckerberg,Dustin Moskovitz,Chris Hughes");
		faceBook.setCeo("Mark Zuckerberg");
		faceBook.setUrl("facebook.com");
		faceBook.setreRistration("Required");
		faceBook.setUsers(2.94);
		faceBook.setcurrentStatus("Active");
		faceBook.setWrittenIn("C++,Hack");
		faceBook.setWebsite("www.facebook.com");
		System.out.println("type of site is :" + faceBook.getType());
		System.out.println("Available In Languages is :" + faceBook.getAvailableInLanguages());
		System.out.println("List Of Languages is :" + faceBook.getListOfLanguages());
		System.out.println("Founded in :" + faceBook.getFounded());
		System.out.println("Area Served is :" + faceBook.getAreaServed());
		System.out.println("Owner is :" + faceBook.getOwner());
		System.out.println("Founders are :" + faceBook.getFounders());
		System.out.println("Ceo is :" + faceBook.getCeo());
		System.out.println("Urlis :" + faceBook.getUrl());
		System.out.println("Registration is :" + faceBook.getRegistration());
		System.out.println("Users  is :" + faceBook.getUsers());
		System.out.println("CurrentStatus is :" + faceBook.getCurrentStatus());
		System.out.println("WrittenIn :" + faceBook.getWrittenIn());
		System.out.println("Website is :" + faceBook.getWebsite());
		System.out.println("\n");
	}

}

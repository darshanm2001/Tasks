package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.Snapchat;

public class SnapchatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking Snapchat");
		Snapchat snapchat = new Snapchat();
		snapchat.setType("Post Style");
		System.out.println("Type is:" + snapchat.getType());
		snapchat.setVesrion(1.6f);
		System.out.println("Vesion is:" + snapchat.getVersion());
		snapchat.setNoOfFollowers(100);
		System.out.println("Followers is:" + snapchat.getNoOfFollowers());
		snapchat.setFeatures("Photos");
		System.out.println("Features is:" + snapchat.getFeatures());
		snapchat.setUpdates(true);
		System.out.println("Updates is:" + snapchat.isUpdates());
		snapchat.setPrivacy(true);
		System.out.println("privacy is:" + snapchat.isPrivacy());
		snapchat.setAdvantage("One-On-One Communication");
		System.out.println("Advantages is:" + snapchat.getAdvantage());
		snapchat.setNoOfUsers(100);
		System.out.println("Number of Users is:" + snapchat.getNoOfUsers());
		snapchat.setRecordCalls(false);
		System.out.println("Record the call is:" + snapchat.isRecordCalls());
		snapchat.setMyNumber(1234567891L);
		System.out.println("My Number is:" + snapchat.getMyNumber());
		snapchat.setInventorYear(2011);
		System.out.println("Invented Year is:" + snapchat.getInventorYear());
		snapchat.setUserName("Sushma");
		System.out.println("User Name is:" + snapchat.getUserName());
		snapchat.setPassword(true);
		System.out.println("Password is:" + snapchat.isPassword());
		snapchat.setInventor("Evan Spiegel");
		System.out.println("Inventor Name is:" + snapchat.getInventor());
		System.out.println("\n");
	}

}

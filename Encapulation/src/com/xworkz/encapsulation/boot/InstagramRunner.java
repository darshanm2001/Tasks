package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.Instagram;

public class InstagramRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking Instagram");
		Instagram instagram = new Instagram();
		instagram.setType("Instagram lite");
		System.out.println("Type is:" + instagram.getType());
		instagram.setVesrion(1.6f);
		System.out.println("Vesion is:" + instagram.getVersion());
		instagram.setNoOfFollowers(100);
		System.out.println("Followers is:" + instagram.getNoOfFollowers());
		instagram.setFeatures("Posts");
		System.out.println("Features is:" + instagram.getFeatures());
		instagram.setUpdates(true);
		System.out.println("Updates is:" + instagram.isUpdates());
		instagram.setPrivacy(true);
		System.out.println("privacy is:" + instagram.isPrivacy());
		instagram.setAdvantage("Business Branding");
		System.out.println("Advantages is:" + instagram.getAdvantage());
		instagram.setNoOfUsers(100);
		System.out.println("Number of Users is:" + instagram.getNoOfUsers());
		instagram.setRecordCalls(false);
		System.out.println("Record the call is:" + instagram.isRecordCalls());
		instagram.setMyNumber(1234567891L);
		System.out.println("My Number is:" + instagram.getMyNumber());
		instagram.setInventorYear(2012);
		System.out.println("Invented Year is:" + instagram.getInventorYear());
		instagram.setUserName("Sachin");
		System.out.println("User Name is:" + instagram.getUserName());
		instagram.setPassword(true);
		System.out.println("Password is:" + instagram.isPassword());
		instagram.setInventor("Kevin Systrom");
		System.out.println("Inventor Name is:" + instagram.getInventor());
		System.out.println("\n");
	}

}

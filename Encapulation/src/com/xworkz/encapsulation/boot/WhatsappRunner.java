package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.WhatsApp;

public class WhatsappRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in mainRunner");
		System.out.println("\n");
		
		System.out.println("invoking whatsApp");
		WhatsApp whatsApp = new WhatsApp();
		whatsApp.setType("GB WhatsApp");
		System.out.println("Type is:" + whatsApp.getType());
		whatsApp.setVesrion(1.8f);
		System.out.println("Version is" + whatsApp.getVersion());
		whatsApp.setNoOfContacts(10);
		System.out.println("NoOfContacts is:" + whatsApp.getNoOfContacts());
		whatsApp.setFeatures("Italic");
		System.out.println("Features is:" + whatsApp.getFeatures());
		whatsApp.setUpdates(true);
		System.out.println("Update is:" + whatsApp.isUpdates());
		whatsApp.setPrivacy(true);
		System.out.println("Privacy is:" + whatsApp.isPrivacy());
		whatsApp.setAdvantage("Sharing Information");
		System.out.println("Advantages is:" + whatsApp.getAdvantage());
		whatsApp.setNoOfUsers(20);
		System.out.println("Number of Users is:" + whatsApp.getNoOfUsers());
		whatsApp.setRecordCalls(false);
		System.out.println("Record call is:" + whatsApp.isRecordCalls());
		whatsApp.setMyNumber(9880449303L);
		System.out.println("My Number is:" + whatsApp.getMyNumber());
		whatsApp.setInventorYear(1975);
		System.out.println("Inventor year is:" + whatsApp.getInventorYear());
		whatsApp.setUserName("Sachin");
		System.out.println("User Name is:" + whatsApp.getUserName());
		whatsApp.setPassword(true);
		System.out.println("Password is:" + whatsApp.isPassword());
		whatsApp.setInventor("Jan Koum");
		System.out.println("Inventor is:" + whatsApp.getInventor());
	}



	}



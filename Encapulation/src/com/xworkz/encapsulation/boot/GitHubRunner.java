package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.GitHub;

public class GitHubRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking gitHub");
		GitHub gitHub = new GitHub();
		gitHub.setType("Web Based");
		System.out.println("Type is:" + gitHub.getType());
		gitHub.setVesrion(1.8f);
		System.out.println("Version is" + gitHub.getVersion());
		gitHub.setNoOfContacts(10);
		System.out.println("NoOfContacts is:" + gitHub.getNoOfContacts());
		gitHub.setFeatures("CodeSpaces");
		System.out.println("Features is:" + gitHub.getFeatures());
		gitHub.setUpdates(true);
		System.out.println("Update is:" + gitHub.isUpdates());
		gitHub.setPrivacy(true);
		System.out.println("Privacy is:" + gitHub.isPrivacy());
		gitHub.setAdvantage("Easy to Share Codes");
		System.out.println("Advantages is:" + gitHub.getAdvantage());
		gitHub.setNoOfUsers(20);
		System.out.println("Number of Users is:" + gitHub.getNoOfUsers());
		gitHub.setRecordCalls(false);
		System.out.println("Record call is:" + gitHub.isRecordCalls());
		gitHub.setMyNumber(9880449303L);
		System.out.println("My Number is:" + gitHub.getMyNumber());
		gitHub.setInventorYear(2008);
		System.out.println("Inventor year is:" + gitHub.getInventorYear());
		gitHub.setUserName("Bindhu");
		System.out.println("User Name is:" + gitHub.getUserName());
		gitHub.setPassword(true);
		System.out.println("Password is:" + gitHub.isPassword());
		gitHub.setInventor("Scott Chacon");
		System.out.println("Inventor is:" + gitHub.getInventor());
		System.out.println("\n");

	}

}

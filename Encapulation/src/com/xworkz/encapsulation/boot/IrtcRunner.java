package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.Irctc;

public class IrtcRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking IRCTC");
		Irctc irctc = new Irctc();
		irctc.setFullForm("Indian Railway Catering Tourism Corporation");
		irctc.setType("Public");
		irctc.setTradedAs("BSE:542830");
		irctc.setIsin("IN335Y01012");
		irctc.setFounded("27 september 1999");
		irctc.setHeadquarters("New Delhi,India");
		irctc.setAreaServed("India");
		irctc.setKeyPeople("Rajni Hasija,IRAS");
		irctc.setServices("online ticketing,Catering,Tourism,Hospital services");
		irctc.setRevenue(3541);
		irctc.setOperatingIncome(1354);
		irctc.setOwner("Government of India");
		irctc.setWebsite("www.irctc.co.in");
		irctc.setIndustry("Railways");
		System.out.println("Urctc full form is :" + irctc.getFullForm());
		System.out.println("type is :" + irctc.getType());
		System.out.println("Trade As is :" + irctc.getTradedAs());
		System.out.println("ISIN is :" + irctc.getIsin());
		System.out.println("Founded in :" + irctc.getFounded());
		System.out.println("Headquarters in :" + irctc.getHeadquarters());
		System.out.println("AreaServed :" + irctc.getAreaServed());
		System.out.println("key people is :" + irctc.getKeyPeople());
		System.out.println("Services is :" + irctc.getServices());
		System.out.println("Revenue in crors :" + irctc.getRevenue());
		System.out.println("operating income in crors :" + irctc.getOperatingIncome());
		System.out.println("Owner is :" + irctc.getOwner());
		System.out.println("Website is :" + irctc.getWebsite());
		System.out.println("industry is :" + irctc.getIndustry());
		System.out.println("\n");
	}

}

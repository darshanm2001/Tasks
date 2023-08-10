package com.xworkz.encapsulation.boot;

import com.xworkz.encapulation.app.Amazon;

public class AmazonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("inboking Amazon");
		Amazon amazon = new Amazon();
		amazon.setTradeName("Amazon");
		amazon.setType("Public");
		amazon.setTradedAs("Darshan");
		amazon.setIsin("US0231351067");
		amazon.setFounded("july 5,1994");
		amazon.setFounder("Jeff Bezos");
		amazon.setAreaServed("Worldwide");
		amazon.setHeadquarters("Settle,Washington and Arlington,U.S");
		amazon.setKeyPeople("Jeff Bezos and Andy Jassy");
		amazon.setProducts("Echo.Fire tablet.fire Tv.Fire OS.kindle");
		amazon.setServices("Amazon.com,Amazon Alexa,Amazon Appstore,etc");
		amazon.setRevenue(13.98);
		amazon.setOperatingIncome(12.25);
		amazon.setTotalAssets(62.68);
		System.out.println("Trade Name is :" + amazon.getTradeName());
		System.out.println("Type is :" + amazon.getType());
		System.out.println("Trade As is :" + amazon.getTradedAs());
		System.out.println("ISIN is :" + amazon.getIsin());
		System.out.println("Founded in :" + amazon.getFounded());
		System.out.println("Founder Name is :" + amazon.getFounder());
		System.out.println("Area Served  is :" + amazon.getAreaServed());
		System.out.println("Headquarters  is :" + amazon.getHeadquarters());
		System.out.println("key people is :" + amazon.getKeyPeople());
		System.out.println("products is :" + amazon.getProducts());
		System.out.println("Services is :" + amazon.getServices());
		System.out.println("Revenue in billion is :" + amazon.getRevenue());
		System.out.println("operating income in billion is :" + amazon.getOperatingIncome());
		System.out.println("total assets in billion is :" + amazon.getTotalAssets());
		System.out.println("\n");

	}

}

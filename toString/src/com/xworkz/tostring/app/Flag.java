package com.xworkz.tostring.app;

public class Flag {
	 private String country;
	    private String colors;
	    private String emblem;

	    public Flag() {
	    }
	    

		public Flag(String country, String colors, String emblem) {
			super();
			this.country = country;
			this.colors = colors;
			this.emblem = emblem;
		}
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "Country:"+country+"Colors: "+colors+"Emblem :" +emblem;
	    }
	    }


	   

	    



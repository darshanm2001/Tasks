package com.xworkz.tostring.app;

public class Logo {
	private String logoName;
    private String color;
    private double width;
    private double height;
    private String imageUrl;
    
    public Logo(){
    	
    }

	public Logo(String logoName, String color, double width, double height, String imageUrl) {
		super();
		this.logoName = logoName;
		this.color = color;
		this.width = width;
		this.height = height;
		this.imageUrl = imageUrl;
	}
   @Override
    public String toString() {
    System.out.println("Invoking toString() from Logo");
    return "LogoName:"+logoName+ "Logo color:"+color+ "Logo width:"+width+ "Logo Height:"+height+ "ImageUrl:"+imageUrl;
    }
}



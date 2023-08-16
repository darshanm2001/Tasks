package com.xworkz.tostring.app;

public class Kerchief {
	private String kerchiefName;
    private String pattern;
    private double length;
    private String material;
    private boolean isPrinted;
    private String manufacturer;
    private int numberOfLayers;
    

    public Kerchief() {

    }

    public Kerchief(String kerchiefName, String pattern, double length,String material, boolean isPrinted, String manufacturer, int numberOfLayers) {
        this.kerchiefName = kerchiefName;
        this.pattern = pattern;
        this.length = length;
        this.material = material;
        this.isPrinted = isPrinted;
        this.manufacturer = manufacturer;
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return "Kerchief Name: " + kerchiefName +  "\nPattern: " + pattern + "\nLength: " + length + "\nMaterial: " + material + "\nIs Printed: " + isPrinted +  "\nManufacturer: " + manufacturer + "\nNumber of Layers: "+ numberOfLayers;
    }
}




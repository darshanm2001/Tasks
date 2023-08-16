package com.xworkz.tostring.app;

public class Cave {
	private String caveName;
    private int numberOfRooms;
    private double length;
    private double width;
    private double height;
    private boolean hasWaterSource;
    private boolean hasNaturalLight;
    private String location;
    private boolean isExplored;
    private String description;
    
    public Cave() {
    	
    }

    public Cave(String caveName, int numberOfRooms, double length, double width, double height, boolean hasWaterSource, boolean hasNaturalLight, String location,boolean isExplored, String description) {
        this.caveName = caveName;
        this.numberOfRooms = numberOfRooms;
        this.length = length;
        this.width = width;
        this.height = height;
        this.hasWaterSource = hasWaterSource;
        this.hasNaturalLight = hasNaturalLight;
        this.location = location;
        this.isExplored = isExplored;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Cave Name: " + caveName + "\nNumber of Rooms: " + numberOfRooms +"\nDimensions: " + length + "x" + width + "x" + height + "\nHas Water Source: " + hasWaterSource +"\nHas Natural Light: " + hasNaturalLight +"\nLocation: " + location + "\nIs Explored: " + isExplored + "\nDescription: " + description;
    }
}






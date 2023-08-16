package com.xworkz.tostring.app;

public class Pendant {
	private String pendantName;
    private String material;
    private double width;
    private double height;
    private String imageUrl;
    private String gemstone;
    private int gemstoneCount;
    private String chainType;
    private boolean isEngraved;
    private String engravingText;
    private String color;
    private double weight;

    public Pendant() {
        
    }

    public Pendant(String pendantName, String material, double width, double height, String imageUrl,String gemstone, int gemstoneCount, String chainType, boolean isEngraved,String engravingText, String color, double weight) {
        this.pendantName = pendantName;
        this.material = material;
        this.width = width;
        this.height = height;
        this.imageUrl = imageUrl;
        this.gemstone = gemstone;
        this.gemstoneCount = gemstoneCount;
        this.chainType = chainType;
        this.isEngraved = isEngraved;
        this.engravingText = engravingText;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PendantName: " + pendantName + "\nMaterial: " + material + "\nWidth: " + width + "\nHeight: " + height +"\nImageUrl: " + imageUrl + "\nGemstone: " + gemstone + "\nGemstoneCount: " + gemstoneCount +"\nChainType: " + chainType + "\nIsEngraved: " + isEngraved + "\nEngravingText: " + engravingText +"\nColor: " + color + "\nWeight: " + weight;
    }
}




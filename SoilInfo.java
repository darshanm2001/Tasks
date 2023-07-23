class SoilInfo{
	static String color;
	static String texture;
	int phValue;
	String temperature;
	
	
	
	SoilInfo(String color,String texture)
	{
		System.out.println("Invoking static argument in Soil");
		this.color=color;
		this.texture=texture;
		
	}
	
	
	SoilInfo(int phValue,String temperature)
	{
		System.out.println("Invoking Instance argument in soilinfo");
		this.phValue=phValue;
		this.temperature=temperature;
	}
	
	
	static void printstatic()
	{
		System.out.println("invoking static void in SoilInfo");
		System.out.println("color:"+ color);
		System.out.println("texture:"+texture);
		
	}
	
	void printInstance()
	{
     	System.out.println("invoking static void in Soil");
		System.out.println("phValue:"+ phValue);
		System.out.println("temperature:"+temperature);	
	}
	
	
}
class Butterfly{
	static String type;
	static String color;
	int noOfButterfly;
	String flyingSpeed;
	
	Butterfly(String type,String color)
	{
	System.out.println("invoking static argument in Butterfly");
	this.type=type;
	this.color=color;
	}
	
	Butterfly(int noOfButterfly,String flyingSpeed)
	{
		System.out.println("invoking instance in Butterfly");
		this.noOfButterfly=noOfButterfly;
		this.flyingSpeed=flyingSpeed;
	}
	
	static void printStatic()
	{
		System.out.println("invoking static void in Butterfly");
		System.out.println("type:"+ type);
		System.out.println("color:"+color);
		
	}
	void printInstance()
	{
		System.out.println("invoking instance in Butterfly");
		System.out.println("noOfButterfly:"+noOfButterfly);
		System.out.println("flyingSpeed:"+flyingSpeed);
	}
	
	
	
}

	
	
	
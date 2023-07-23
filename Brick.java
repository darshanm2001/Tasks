class Brick{
	static String color;
	static String durability;
	int price;
	String size;
	
	Brick(String color,String durability)
	{
		System.out.println("invoking in static argument in Brick");
		this.color=color;
		this.durability=durability;
	}
	Brick(int price,String size)
	{
		System.out.println("invoking in instance argument in Brick");
		this.price=price;
		this.size=size;
	}
	
	
	static{
		color="Red";
		durability="50 years";
	}
	
	static void printStatic()
	{
		System.out.println("invoking static void in Brick");
		System.out.println(color);
		System.out.println(durability);
	}
	
	void printInstance()
	{
	    System.out.println("invoking Instance void in Brick");
		System.out.println(price);
		System.out.println(size);
	
    }
}
class Helmet{
	static String brand;
	static int price;
	String type;
	String color;
	
	Helmet(String brand,int price)
	{
		System.out.println("invoking at static argument in Helmet");
		this.brand=brand;
		this.price=price;
	}
	
	Helmet(String type,String color)
	{
		System.out.println("invoking in instance argument in Helmet");
		this.type=type;
		this.color=color;
	}
	
	
	static{
		brand="Axor";
		price=2000;
		System.out.println("invoking static in Helmet");
	}
	static void printStatic()
	{
		System.out.println("invoking static void in helmet");
		System.out.println(brand);
		System.out.println(price);
	}
	
	 void printInstance()
	{
		System.out.println("invoking insatnce void in helmet");
		System.out.println(type);
		System.out.println(color);
    }
}
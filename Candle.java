class Candle{
	static String color;
	static int noOfcandles;
	String weight;
	double price;
	
	
	Candle(String color,int noOfcandles)
	{
		System.out.println("invoking static in argument in Candle");
		this.color=color;
		this.noOfcandles=noOfcandles;
	}
	
	Candle(String weight,double price)
	{
		System.out.println("invoking instance in arhument in Candle");
		this.weight=weight;
		this.price=price;
	}
	
	static void printStatic()
	{
		System.out.println("invoking static void in candle");
		System.out.println("color:"+color);
		System.out.println("noOfcandles:"+noOfcandles);
		
	}
	 void printInstance()
	{
		System.out.println("invoking Instance void in candle");
		System.out.println("weight:"+weight);
		System.out.println("price:"+price);
		
	}
	
}
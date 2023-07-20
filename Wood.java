class Wood{
	String type;
	double price;
	boolean polished;
	String length;
	String width;
	
	
	Wood()
	{
		System.out.println("invoking no-arg condt of Wood");
	}
	Wood(String type)
	{
		super();
		System.out.println("invoking String const of chicken");
		this.type=type;
	}
	Wood(String type,double price)
	{
		this(type);
		System.out.println("invoking String, double const of chicken");
		this.price=price;
	}
	Wood(String type,double price,boolean polished)
	{
		this(type,price);
		System.out.println("invoking String, double,boolean const of chicken");
		this.polished=polished;
	}
	Wood(String type,double price,boolean polished,String length)
	{
		this(type,price,polished);
		System.out.println("invoking String, doubl,boolean,Stringe const of chicken");
		this.length=length;
		
	}
	Wood(String type,double price,boolean polished,String length,String width)
	{
		this(type,price,polished,width);
		System.out.println("invoking String, double,boolean,Stringe,String const of chicken");
		this.width=width;
		
	}
}
class Mall{   
    String name;
    String location;
    int numberOfStores;
    double areaInSquareFeet;
    boolean hasParking;
    boolean isOpenOnSundays;
    String mainAttraction;
	
	Mall()
	{
		System.out .println("invoking no-argument in Mall");
	}
	
	Mall(String name)
	{
		super();
		System.out.println("invoking String name in Mall");
		this.name=name;
	}
	
	Mall(String name, String location)
	{
		this(name);
		System.out.println("invoking String name, String location in Mall");
		
		this.location=location;
	}
	
	Mall(String name, String location, int numberOfStores)
	{
		this(name,location);
		System.out.println("invoking String name, String location,int numberOfStores in Mall");
		
		this.numberOfStores=numberOfStores;
	}
	
	Mall(String name, String location, int numberOfStores, double areaInSquareFeet)
	{
		this(name,location,numberOfStores);
		System.out.println("invoking String name, String location,int numberOfStores, double areaInSquareFeet in Mall");
		
		this.areaInSquareFeet=areaInSquareFeet;
	}
	
	Mall(String name, String location, int numberOfStores, double areaInSquareFeet, boolean hasParking)
	{
		this(name,location,numberOfStores,areaInSquareFeet);
		System.out.println("invoking String name, String location,int numberOfStores, double areaInSquareFeet, boolean hasParking in Mall");
		
		this.hasParking=hasParking;
	}
	
	Mall(String name, String location, int numberOfStores, double areaInSquareFeet, boolean hasParking, boolean isOpenOnSundays)
	{
		this(name,location,numberOfStores,areaInSquareFeet,hasParking);
		System.out.println("invoking String name, String location,int numberOfStores, double areaInSquareFeet, boolean hasParking, boolean isOpenOnSundays in Mall");
		
		this.isOpenOnSundays=isOpenOnSundays;
	}
	
	Mall(String name, String location, int numberOfStores, double areaInSquareFeet, boolean hasParking, boolean isOpenOnSundays,String mainAttraction)
	{
		this(name,location,numberOfStores,areaInSquareFeet,hasParking,isOpenOnSundays);
		System.out.println("invoking String name, String location,int numberOfStores, double areaInSquareFeet, boolean hasParking, boolean isOpenOnSundays, String mainAttraction in Mall");
		
		this.mainAttraction=mainAttraction;
	}
}
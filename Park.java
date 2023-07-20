class Park{
	
	String name;
    String location;
    int areaInAcres;
    boolean hasPlayground;
    boolean hasWalkingTrails;
    int numberOfBenches;
    boolean hasPicnicAreas;
    boolean isDogFriendly;
    String mainAttraction;
	
	Park()
	{
		System.out.println("invoking no argument in Park");
	}
	
	Park(String name)
	{
		super();
		System.out.println("invoking String name in Park");
		this.name=name;
	}
	
	Park(String name,String location)
	{
		this(name);
		System.out.println("invoking String name,String location in Park");
		this.location=location;
	}
	
	Park(String name,String location,int areaInAcres)
	{
		this(name,location);
		System.out.println("invoking String name,String location,int areaInAcres in Park");
		this.areaInAcres=areaInAcres;
	}
	
	Park(String name,String location,int areaInAcres,boolean hasPlayground)
	{
		this(name,location,areaInAcres);
		System.out.println("invoking String name,String location,int areaInAcres,boolean hasPlayground in Park");
		this.hasPlayground=hasPlayground;
	}
	
	
	Park(String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails)
	{
		this(name,location,areaInAcres,hasPlayground);
		System.out.println("invoking String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails in Park");
		this.hasWalkingTrails=hasWalkingTrails;
	}
	
	Park(String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails,int numberOfBenches)
	{
		this(name,location,areaInAcres,hasPlayground,hasWalkingTrails);
		System.out.println("invoking String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails,int numberOfBenches in Park");
		this.numberOfBenches=numberOfBenches;
	}
	
	Park(String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails,int numberOfBenches,boolean hasPicnicAreas)
	{
		this(name,location,areaInAcres,hasPlayground,hasWalkingTrails,numberOfBenches);
		System.out.println("invoking String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails,int numberOfBenches,boolean hasPicnicAreas in Park");
		this.hasPicnicAreas=hasPicnicAreas;
	}
	
	Park(String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails,int numberOfBenches,boolean hasPicnicAreas,boolean isDogFriendly)
	{
		this(name,location,areaInAcres,hasPlayground,hasWalkingTrails,numberOfBenches,hasPicnicAreas);
		System.out.println("invoking String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails,int numberOfBenches,boolean hasPicnicAreas,boolean isDogFriendly in Park");
		this.isDogFriendly=isDogFriendly;
	}
	
	Park(String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails,int numberOfBenches,boolean hasPicnicAreas,boolean isDogFriendly,String mainAttraction)
	{
		this(name,location,areaInAcres,hasPlayground,hasWalkingTrails,numberOfBenches,hasPicnicAreas,isDogFriendly);
		System.out.println("invoking String name,String location,int areaInAcres,boolean hasPlayground,boolean hasWalkingTrails,int numberOfBenches,boolean hasPicnicAreas,boolean isDogFriendly,String mainAttraction in Park");
		this.mainAttraction=mainAttraction;
	}
}
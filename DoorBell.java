class DoorBell{
	String tune;
	String typeOfDoorBell;
	int price;
	String varity;
	String bellFrequency;
	int doorBellSize;
	String color;
	
	
	DoorBell()
	{
		System.out.println("Invoking no-args constructor");
		System.out.println("Tune :" + this.tune);
		System.out.println("Tyoe Of door Bell :" + this.typeOfDoorBell);
		System.out.println("Price :" + this.price);
		System.out.println("Varity :" + this.varity);
		System.out.println("Bell Frequency :"+ this.bellFrequency);
		System.out.println("Door Bell Size:" +this.doorBellSize);
		System.out.println("Color:" +this.color);
		
	}
		DoorBell(String tune)
		{
			System.out.println("invoking constructor of Door Bell");
			this.tune=tune;
		}
		DoorBell(String tune,String typeOfDoorBell)
		{
			System.out.println("invoking constructor of Door Bell");
			this.tune=tune;
			this.typeOfDoorBell=typeOfDoorBell;
		}
		DoorBell(String tune,String typeOfDoorBell,int price)
		{
			System.out.println("invoking constructor of Door Bell");
			this.tune=tune;
			this.typeOfDoorBell=typeOfDoorBell;
			this.price=price;
		}
		DoorBell(String tune,String typeOfDoorBell,int price,String varity)
		{
			System.out.println("invoking constructor of Door Bell");
			this.tune=tune;
			this.typeOfDoorBell=typeOfDoorBell;
			this.price=price;
			this.varity=varity;
		}
		DoorBell(String tune,String typeOfDoorBell,int price,String varity,String bellFrequency)
		{
			System.out.println("invoking constructor of Door Bell");
			this.tune=tune;
			this.typeOfDoorBell=typeOfDoorBell;
			this.price=price;
			this.varity=varity;
			this.bellFrequency=bellFrequency;
		}
		DoorBell(String tune,String typeOfDoorBell,int price,String varity,String bellFrequency,int doorBellSize)
		{
			System.out.println("invoking constructor of Door Bell");
			this.tune=tune;
			this.typeOfDoorBell=typeOfDoorBell;
			this.price=price;
			this.varity=varity;
			this.bellFrequency=bellFrequency;
			this.doorBellSize=doorBellSize;
		}
		DoorBell(String tune,String typeOfDoorBell,int price,String varity,String bellFrequency,int doorBellSize,String color)
		{
			System.out.println("invoking constructor of Door Bell");
			this.tune=tune;
			this.typeOfDoorBell=typeOfDoorBell;
			this.price=price;
			this.varity=varity;
			this.bellFrequency=bellFrequency;
			this.doorBellSize=doorBellSize;
			this.color=color;
		}
		
	
	
	
}
class DoorBellKiller{
	public static void main(String[] args){
		System.out.println("invoking main method in DoorBellKiller");
		
		DoorBell doorbell=new DoorBell();
		
		System.out.println();
		
		DoorBell doorbell1=new DoorBell("Basic Bell");
		System.out.println("Tune:" + doorbell1.tune);
		System.out.println("typeOfDoorBell:" + doorbell1.typeOfDoorBell);
		System.out.println("price:" + doorbell1.price);
		System.out.println("varity:" + doorbell1.varity);
		System.out.println("bellFrequency:" + doorbell1.bellFrequency);
		System.out.println("doorBellSize:" + doorbell1.doorBellSize);
		System.out.println("color:" + doorbell1.color);
		
		System.out.println();
		
		DoorBell doorbell2=new DoorBell("Basic Bell","Round");
		System.out.println("tune:" + doorbell2.tune);
		System.out.println("typeOfDoorBell:" + doorbell2.typeOfDoorBell);
		System.out.println("price:" + doorbell2.price);
		System.out.println("varity:" + doorbell2.varity);
		System.out.println("bellFrequency:" + doorbell2.bellFrequency);
		System.out.println("doorBellSize:" + doorbell2.doorBellSize);
		System.out.println("color:" + doorbell2.color);
		
		System.out.println();
		
		DoorBell doorbell3=new DoorBell("Basic Bell","Round",200);
		System.out.println("tune:" + doorbell3.tune);
		System.out.println("typeOfDoorBell:" + doorbell3.typeOfDoorBell);
		System.out.println("price:" + doorbell3.price);
		System.out.println("varity:" + doorbell3.varity);
		System.out.println("bellFrequency:" + doorbell3.bellFrequency);
		System.out.println("doorBellSize:" + doorbell3.doorBellSize);
		System.out.println("color:" + doorbell3.color);
		
		System.out.println();
		
		DoorBell doorbell4=new DoorBell("Basic Bell","Round",200,"Wireless");
		System.out.println("tune:" + doorbell4.tune);
		System.out.println("typeOfDoorBell:" + doorbell4.typeOfDoorBell);
		System.out.println("price:" + doorbell4.price);
		System.out.println("varity:" + doorbell4.varity);
		System.out.println("bellFrequency:" + doorbell4.bellFrequency);
		System.out.println("doorBellSize:" + doorbell4.doorBellSize);
		System.out.println("color:" + doorbell4.color);
		
		System.out.println();
		
		DoorBell doorbell5=new DoorBell("Basic Bell","Round",200,"Wireless","120Hz");
		System.out.println("tune:" + doorbell5.tune);
		System.out.println("typeOfDoorBell:" + doorbell5.typeOfDoorBell);
		System.out.println("price:" + doorbell5.price);
		System.out.println("varity:" + doorbell5.varity);
		System.out.println("bellFrequency:" + doorbell5.bellFrequency);
		System.out.println("doorBellSize:" + doorbell5.doorBellSize);
		System.out.println("color:" + doorbell5.color);
		
			System.out.println();
			
		DoorBell doorbell6=new DoorBell("Basic Bell","Round",200,"Wireless","120Hz",100);
		System.out.println("tune:" + doorbell6.tune);
		System.out.println("typeOfDoorBell:" + doorbell6.typeOfDoorBell);
		System.out.println("price:" + doorbell6.price);
		System.out.println("varity:" + doorbell6.varity);
		System.out.println("bellFrequency:" + doorbell6.bellFrequency);
		System.out.println("doorBellSize:" + doorbell6.doorBellSize);
		System.out.println("color:" + doorbell6.color);
		
		
			System.out.println();
			
		DoorBell doorbell7=new DoorBell("Basic Bell","Round",200,"Wireless","120Hz",100,"Red");
		System.out.println("tune:" + doorbell7.tune);
		System.out.println("typeOfDoorBell:" + doorbell7.typeOfDoorBell);
		System.out.println("price:" + doorbell7.price);
		System.out.println("varity:" + doorbell7.varity);
		System.out.println("bellFrequency:" + doorbell7.bellFrequency);
		System.out.println("doorBellSize:" + doorbell7.doorBellSize);
		System.out.println("color:" + doorbell7.color);
		
		
		
		
	}
}
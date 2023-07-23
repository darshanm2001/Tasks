class SoilRunner{
	public static void main(String[] args){
		System.out.println("Invoking main in SoilRunner");
		
		SoilInfo soilInfo=new SoilInfo("Red","Clay");
		SoilInfo.printstatic();
		
		
		SoilInfo soilInfo2=new SoilInfo(7,"75F");
		soilInfo2.printInstance();
	}
}
	
		
		
		
		
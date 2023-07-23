class ButterflyRunner{
	public static void main(String[] args){
		System.out.println("ButterflyRunner invoking in main");
		
		Butterfly butterfly=new Butterfly("Painted lady","yellow");
		Butterfly.printStatic();
		
		Butterfly butterfly1=new Butterfly(450,"5kmh");
		butterfly1.printInstance();
	}
}
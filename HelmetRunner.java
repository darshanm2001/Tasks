class HelmetRunner{
	public static void main(String[] args){
		System.out.println("invokinh main in helmet");
		
		Helmet helmet=new Helmet("Axor",2000);
		Helmet.printStatic();
		
		Helmet helmet1=new Helmet("Half helmet","balck");
		helmet1.printInstance();
		
	}
	
}
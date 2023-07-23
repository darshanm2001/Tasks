class CandleRunner{
	public static void main(String[] args){
		System.out.println("Invoking main in CandleRunner");
		
		
		Candle candle=new Candle("Yellow",50);
		Candle.printStatic();
		
		Candle candle1=new Candle("100gm",30);
		candle1.printInstance();
	}
}
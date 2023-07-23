class BrickRunner{
	public static void main(String[] args){
		System.out.println("invokinh main in BrickRunner");
		
		Brick brick=new Brick("Red","50 years");
		Brick.printStatic();
		
		Brick brick1=new Brick(5,"10*15cm");
		brick1.printInstance();
	}
}
class Carrom {  
 String boardColor;
 int numberOfCoins;
 int strikerDiameter;
 float boardLength;
 float boardWidth;

 Carrom() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.boardColor);
        System.out.println("Inside constructor: " + this.numberOfCoins);
        System.out.println("Inside constructor: " + this.strikerDiameter);
        System.out.println("Inside constructor: " + this.boardLength);
        System.out.println("Inside constructor: " + this.boardWidth);
    }

Carrom(String boardColor)
{
    System.out.println("Invoking String parameterized constructor");
   this.boardColor=boardColor;
}
Carrom(String boardColor,int numberOfCoins)
{
    System.out.println("Invoking String,int parameterized constructor");
  this.boardColor=boardColor;
  this.numberOfCoins=numberOfCoins;
}
Carrom(String boardColor,int numberOfCoins,int strikerDiameter)
{
    System.out.println("Invoking String,int,int parameterized constructor");
  this.boardColor=boardColor;
  this.numberOfCoins=numberOfCoins;
  this.strikerDiameter=strikerDiameter;
}
Carrom(String boardColor,int numberOfCoins,int strikerDiameter,float boardLength)
{
    System.out.println("Invoking String,int,int,float parameterized constructor");
   this.boardColor=boardColor;
  this.numberOfCoins=numberOfCoins;
  this.strikerDiameter=strikerDiameter;
  this.boardLength=boardLength;
}
Carrom(String boardColor,int numberOfCoins,int strikerDiameter,float boardLength,float boardWidth)
{
    System.out.println("Invoking String,int,int,float,float parameterized constructor");
  this.boardColor=boardColor;
  this.numberOfCoins=numberOfCoins;
  this.strikerDiameter=strikerDiameter;
  this.boardLength=boardLength;
  this.boardWidth=boardWidth;
}
}

class CarromPlayer{
public static void main (String[] args)
{
System.out.println();

    System.out.println("Invoking main in CarromPlayer");

Carrom board =new Carrom();

System.out.println();

    Carrom board1=new Carrom("Red");
        System.out.println("Color : " + board1.boardColor);
        System.out.println("Total coins : " + board1.numberOfCoins);
        System.out.println("Striker diameter: " + board1.strikerDiameter);
        System.out.println("Board length: " + board1.boardLength);
        System.out.println("Board Width: " + board1.boardWidth);

System.out.println();

    Carrom board2=new Carrom("Red",18);
        System.out.println("Color : " + board2.boardColor);
        System.out.println("Total coins : " + board2.numberOfCoins);
        System.out.println("Striker diameter: " + board1.strikerDiameter);
        System.out.println("Board length: " + board2.boardLength);
        System.out.println("Board Width: " + board2.boardWidth);

System.out.println();

    Carrom board3=new Carrom("Red",18,8);
        System.out.println("Color : " + board3.boardColor);
        System.out.println("Total coins : " + board3.numberOfCoins);
        System.out.println("Striker diameter: " + board3.strikerDiameter);
        System.out.println("Board length: " + board3.boardLength);
        System.out.println("Board Width: " + board3.boardWidth);

System.out.println();

    Carrom board4=new Carrom("Red",18,8,60f);
        System.out.println("Color : " + board4.boardColor);
        System.out.println("Total coins : " + board4.numberOfCoins);
        System.out.println("Striker diameter: " + board4.strikerDiameter);
        System.out.println("Board length: " + board4.boardLength);
        System.out.println("Board Width: " + board4.boardWidth);

System.out.println();

    Carrom board5=new Carrom("Red",18,8,60,60f);
        System.out.println("Color : " + board5.boardColor);
        System.out.println("Total coins : " + board5.numberOfCoins);
        System.out.println("Striker diameter: " + board5.strikerDiameter);
        System.out.println("Board length: " + board5.boardLength);
        System.out.println("Board Width: " + board5.boardWidth);



    }

}
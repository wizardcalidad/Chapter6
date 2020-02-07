import java.security.SecureRandom;
public class CrapsGame {
    private static final SecureRandom random = new SecureRandom();
    private static final int seven = 7;
    private static final int snake_eyes = 2;
    private static final int trey = 3;
    private static final int yo_leven = 11;
    private  static final int box_cars = 12;
    private enum Status{ WON, LOST, CONTINUE};


   public static int rollDice(){
       int diceOne = 1 + random.nextInt(6);
       int diceTwo = 1 + random.nextInt(6);

       int sum = diceOne + diceTwo;

       System.out.printf("The player rolled %d + %d = %d%n",diceOne,diceTwo,sum);

       return sum;
   }


    public static void main(String[] args) {
        Status gameStatus;
        int pointValue = 0;

        int sumOfDice = rollDice();
        switch (sumOfDice){
            case seven:
            case yo_leven:
                gameStatus = Status.WON;
                break;

            case snake_eyes:
            case trey:
            case box_cars:
                gameStatus = Status.LOST;
                break;

            default:
                pointValue = sumOfDice;
                gameStatus = Status.CONTINUE;
                System.out.printf("Point is %d%n", pointValue);
                break;

        }

        while(gameStatus==Status.CONTINUE){
            sumOfDice = rollDice();

            if (pointValue == sumOfDice) {
                gameStatus = Status.WON;

            }
            else if (pointValue==7){
                gameStatus = Status.LOST;

            }
        }
        if (gameStatus==Status.WON){
            System.out.println("You won!");
        }
        else{
            System.out.println("You lost!");
        }


    }

}

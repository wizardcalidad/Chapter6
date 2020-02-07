import java.security.SecureRandom;
import java.util.Scanner;

public class DieGame {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int face = 1 + rand.nextInt(6);
        System.out.println("A die has been rolled, Kindly guess the face that came out: ");
        int pickOne = num.nextInt();
        int counter =1;

        if (pickOne== face){
            System.out.println("You're the Boss!!!");
        }
        else{
            System.out.println("Your guessing skill is low, try again!!!");
            pickOne = num.nextInt();
            while (pickOne!=face) {
             System.out.println("Your guessing skill is low, try again!!!");
                pickOne = num.nextInt();

                counter++;
            }

        }
    }
}

import java.security.SecureRandom;
public class TwentyDiceRoll {
    public static void main(String[] args) {
        SecureRandom mu = new SecureRandom();

        for (int i=0; i <20; i++){
            int TwentyRolls = 1 + mu.nextInt(6);

            System.out.printf("%2d",TwentyRolls);

            if (i%5==0){
                System.out.println();
            }
        }
    }
}

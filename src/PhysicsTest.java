import java.util.Scanner;
public class PhysicsTest {
    public static void main(String[] args) {
        int result= 0;
        Scanner leo = new Scanner(System.in);

        System.out.println("_____This is a succint test on Global Warming____");
        System.out.println("*************************************************************************************");
        System.out.println();
        System.out.println("Quantities with magnitude only are called\n1.  Derived.\n" +
                "2. Fundamental.\n" +
                "3. Scalars.\n" +
                "4. Vectors.");
       int answer = leo.nextInt();
       if(answer == 3){
           result++;
       }
        System.out.println("Which of these is not an effect of heat on an object?\n1. Change in temperature.\n" +
                "2. Expansion the body.\n" +
                "3. Escape velocity.\n" +
                "4. Thermionic emission.\n");
         answer = leo.nextInt();
        if(answer == 3){
            result++;
        }
        System.out.println("When heat is added to a gas, the pressure will \n1. decrease.\n" +
                "2. double.\n" +
                "3. increase.\n" +
                "4. remain constant.");
        answer = leo.nextInt();
        if(answer == 3){
            result++;
        }
        System.out.println("The increase in volume per unit volume per degree rise in temperature is termed\n1. Area expansivity.\n" +
                "2. Cubic expansivity.\n" +
                "3. Linear expansivity.\n" +
                "4. Superficial expansivity.");
        answer = leo.nextInt();
        if(answer == 2){
            result++;
        }
        System.out.println("Newton's third law of motion states that, action and reaction are equal and\n1. at equilibrium.\n" +
                "2. equivalent.\n" +
                "3. opposite.\n" +
                "4. simultaneous.");
        answer = leo.nextInt();
        if(answer == 3){
            result++;
        }
        System.out.printf("The final result is %d/5%n", result);
        switch (result){
            case 0:
            case 1:
            case 2:
                System.out.println("You need to read more so that you dont fail your physics exam again...get a reliable textbook and study hard alaye");
                break;
            case 3:
                System.out.println("This is still fair but you can do better, got that?");
                break;
            case 4:
                System.out.println("you've done well, very good");
                break;
            case 5:
                System.out.println("Excellent! You're a shinning star, soar so high in the sky");
                break;
        }


    }
}

import java.security.SecureRandom;

public class SixMillionRolls {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;

        for (int i =1; i <=6000000; i++) {

            int Dieface = 1 + random.nextInt(6);

            switch (Dieface) {
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                    break;
                case 5:
                    num5++;
                    break;
                case 6:
                    num6++;
                    break;
            }

        }
        System.out.println("Face\t Occurencies");
        System.out.printf("1\t\t%d%n 2\t\t%d%n 3\t\t%d%n 4\t\t%d%n 5\t\t%d%n 6\t\t%d%n",num1,num2,num3,num4,num5,num6);


    }
}

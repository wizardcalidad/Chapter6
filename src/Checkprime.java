import java.util.Scanner;
public class Checkprime {
    Scanner sc = new Scanner(System.in);

    public int prime() {
        System.out.println("Enter any positive number: ");
        int num = sc.nextInt();
      if (num> 0) {
          if (num == 1 || num >= 4 && (num % 2 == 0 || num % 3 == 0)) {
              System.out.printf("%d is not a prime number", num);
          }
          else if (num > 5 && num % 5 == 0) {
              System.out.printf("%d is not a prime number", num);
          }
          else if (num > 7 && num % 7 == 0) {
              System.out.printf("%d is not a prime number", num);
          }
          else if (num > 11 && num % 11 == 0) {
          System.out.printf("%d is not a prime number", num);
          }
          else {
              System.out.printf("%d is a prime number", num);
          }

      }
      else if (num<=0){
              System.out.println("Kayiiii! Number is not a positive integer");
          }
        return num;
    }
}

import java.util.Scanner;
public class ParkingChargesTest {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ParkingCharges myPackSpaceOne = new ParkingCharges("Qoyum","Yusuf");

         myPackSpaceOne.getFirstName();
         myPackSpaceOne.getLastName();

        System.out.println("How many hours have you been packing?: ");
        float hour = sc.nextInt();

        if ( hour == 3){
            System.out.printf("%s %s , YOUr charge is %d%n",  myPackSpaceOne.getFirstName(), myPackSpaceOne.getLastName(), myPackSpaceOne.threehours);
        }
        else if (hour > 3){
            ParkingCharges.calculateCharges();
        }


    }
}

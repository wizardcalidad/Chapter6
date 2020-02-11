import java.util.Scanner;
public class ParkingCharges {
   // public static double hour;
    public double charge;
    public static final double threehours = 2.0;
    public static final double twentyFourHours = 10.0;

    private String firstName;
    private String lastName;

    public ParkingCharges(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
    public void setFirstName(String fName){
        firstName = fName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lName){
        lastName = lName;
    }
    public String getLastName(){
        return lastName;
    }

    public static double calculateCharges(){

        double threehours = 2.0;
        double twentyFourHours = 10;
        double hour =0;

        double charge = threehours + 0.5 * hour;


        return charge;

    }


}

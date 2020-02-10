import java.util.Scanner;
public class ParkingCharges {
    private static float hour;
    private double charge;
    public static final float threehours = 2;
    private static final float twentyFourHours = 10;

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

        double charge = threehours + (0.5 * hour);


        return charge;

    }


}

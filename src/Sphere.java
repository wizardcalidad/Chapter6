import java.util.Scanner;
public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of sphere: ");
        double radius = sc.nextInt();

        System.out.printf("Volume of the sphere is: %.2fcubic-metre%n", sphereVolume(radius));
    }

    public static double sphereVolume(double radius){
        double volume = (4/3) * Math.PI * Math.pow(radius,3);

        return volume;
    }
}

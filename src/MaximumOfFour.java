public class MaximumOfFour {


public int max() {
    int a = 3;
    int b = 5;
    int c = 8;
    int d = 9;


        int maximumValue = a;
        if (b > maximumValue)
            maximumValue = b;
        if (c > maximumValue)
            maximumValue = c;
        if (d > maximumValue)
            maximumValue = d;

        return maximumValue;
}



    public static void main(String[] args) {
    MaximumOfFour mxf = new MaximumOfFour();
        System.out.printf("Maximum is %d%n", mxf.max() );

    }

}

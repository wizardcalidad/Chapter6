public class MethodOverload {
   // public static void main(String[] args) {
     //  max(5.0, 7.5);
    //}
    public static void max(int x, int y){
        int max = 0;
        if (x>max){
            max = x;
        }
        if (y>max){
            max = y;
        }

        System.out.println(max);

    }
    public static void max(double x ,double y){
        double max = 0;
        if (x>max){
            max = x;
        }
        if (y>max){
            max = y;
        }

        System.out.println(max);
    }
}

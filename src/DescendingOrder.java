public class DescendingOrder {

    public static void desc(int v, int x, int y, int z){
        int biggest = v;
        int bigger = 0;
        if (x>biggest){
            biggest = x;
             bigger = v;
        }
        if (y< bigger){
            bigger = y;
        }
        if (z<bigger){
            bigger = y;
            int smallest = z;
        }

       /* public static void desc(double v, double x, double y, double z){
            double biggest = v;
            double bigger = 0;
            if (x>biggest){
                biggest = x;
                bigger = v;
            }
            if (y< bigger){
                bigger = y;
            }
            if (z<bigger){
                bigger = y;
                double smallest = z;
            }

        }
        */
    }
}

public class Diamond {
    public static void main(String[] args) {
        int space = 10;
        int number =1;
        for (int  i = 0; i<10; i++){
            for (int sp =0;sp<space; sp++){
                System.out.print(" ");
            }

            for (int j =0; j<number; j++){
                System.out.print("*");
            }

            System.out.println();
            space--;
            number+=2;
        }

        }


}
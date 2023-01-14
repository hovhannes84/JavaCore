package chepter3;

public class For1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 1;

        for (int i = 1; i <= a; i++) {

            for (int j = a - 1; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <= b; k++) {
                System.out.print("*");

            }
            b++;
            System.out.println();

        }

    }
}

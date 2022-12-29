package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println();

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
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }


    }
}

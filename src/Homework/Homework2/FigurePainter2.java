package Homework.Homework2;

public class FigurePainter2 {

    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i - 1; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <=i+1 ; j++) {
                System.out.print(" ");

            }
            for (int j = 3; j >i ; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}

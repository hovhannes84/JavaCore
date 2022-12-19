package Homework.Homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 57, b = 95;
        int max;

        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
            System.out.println(max);
        }


        int c = 3, d = 9;
        for (int i = c; i <= d; i++) {
            System.out.print(i + " ");

        }
        System.out.println();




        System.out.println((char)a);

        if (a == b) {
            System.out.println("a-ն հավասար է b-ին");

        } else if (a != b) {
            System.out.println("a-ն հավասար չէ b-ին");

        }


    }


}

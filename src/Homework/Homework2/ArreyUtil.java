package Homework.Homework2;

public class ArreyUtil {
    public static void main(String[] args) {

        int[] arrey = {11, 18, 17, 6, 24, 7, 13, 37, 45, 10};
        int max = 0;
        int min = arrey[0];

        for (int i = 0; i < arrey.length; i++) {
            System.out.print(arrey[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] > max) {
                max = arrey[i];
            }

        }
        System.out.println("մասիվի ամենամեծ թիվը " + max);
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] < min) {
                min = arrey[i];
            }


        }
        System.out.println("մասիվի ամենափոքր թիվը " + min);


    }
}

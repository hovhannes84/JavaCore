package homework.homework2;

public class ArreyUtil {
    public static void main(String[] args) {

        int[] arrey = {11, 18, 17, 6, 24, 7, 13, 37, 45, 10};
        int max = arrey[0];
        int min = arrey[0];
        int pair = 0;
        int odd = 0;
        int mean = 0;
        int sum = 0;
        int middle = 0;
        int last = 0;


        for (int i = 0; i < arrey.length; i++) {
            System.out.print(arrey[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] > max) {
                max = arrey[i];
            }

        }
        System.out.println("the largest number in the array " + max);
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] < min) {
                min = arrey[i];
            }


        }
        System.out.println("the smallest number of the fraction" + min);

        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 == 0) {
                pair++;
                System.out.print(arrey[i] + " ");
            }
        }
        System.out.println("all even elements of the array ");
        System.out.println("number of pairs " + pair);

        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 != 0) {
                odd++;
                System.out.print(arrey[i] + " ");
            }

        }
        System.out.println("all odd elements of the array ");
        System.out.println("number of odd " + odd);

        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 == 0) {

            }
        }

        for (int i = 0; i < arrey.length; i++) {
            mean = mean + arrey[i];
            sum = sum + arrey[i];

        }
        mean = mean / arrey.length;
        System.out.println("the arithmetic mean of all the numbers in the array " + mean);
        System.out.println("sum of array elements " + sum);
        System.out.println("the first element of the array " + arrey[0]);

        last = arrey[arrey.length - 1];
        System.out.println("the last element of the array " + last);


        middle = arrey[arrey.length / 2];


        System.out.println("the middle element of the array " + middle);


    }
}

package Homework.Homework2;

public class ArreyUtil {
    public static void main(String[] args) {

        int[] arrey = {11, 18, 17, 6, 24, 7, 13, 37, 45, 10};
        int max = arrey[0];
        int min = arrey[0];
        int z = 0;
        int k = 0;
        int mij = 0;
        int b = 0;
        int m = 0;
        int v = 0;


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

        for (int i = 1; i < arrey.length; i++) {
            if (arrey[i] % 2 == 0) {

                System.out.print(arrey[i] + " ");
            }

        }

        System.out.println("մասիվի բոլոր զույգ էլեմենտները ");

        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 != 0) {
                System.out.print(arrey[i] + " ");
            }

        }
        System.out.println("մասիվի բոլոր կենտ էլեմենտները");

        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 == 0) {
                z++;
            }

        }
        System.out.println("զույգերի քանակը " + z);

        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] % 2 != 0) {
                k++;
            }

        }
        System.out.println("կենտերի քանակը " + k);

        for (int i = 0; i < arrey.length; i++) {
            mij = mij + arrey[i];

        }
        mij = mij / 2;
        System.out.println("մասիվի բոլոր թվերի միջին թվաբանականը " + mij);

        for (int i = 0; i < arrey.length; i++) {
            b = b + arrey[i];

        }
        System.out.println("մասիվի էլեմենտների գումարը " + b);
        System.out.println("մասիվի առաջին էլեմենտը " + arrey[0]);

        for (int i = 0; i < arrey.length / 2; i++) {
            m = arrey[i];

        }
        System.out.println("մասիվի մեջտեղի էլեմենտը " + m);

        for (int i = 0; i < arrey.length; i++) {
            v = arrey[i];

        }
        System.out.println("մասիվի վերջին էլեմենտը " + v);

    }
}

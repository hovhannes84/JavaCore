package homework6;

public class ArrayUtil {

    void maxOfArray(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("մասիվի ամենամեծ թիվը " + max);

    }

    void allElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("մասիվի բոլոր էլեմենտները, ");
    }

    void minOfArray(int[] array) {
        int min = array[0];



        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("մասիվի ամենափոքրը թիվը " + min);
    }
    void pairOfArray(int[] array){
        int pair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pair++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("բոլոր զույգ տարրերը ");
        System.out.println("զույգերի քանակը " + pair);

    }
    void oddOfArray(int[] array){
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd++;
                System.out.print(array[i] + " ");
            }

        }
        System.out.println("մասիվի բոլոր կենտ էլեմենտները։ ");
        System.out.println("կենտերի քանակը " + odd);
    }
    void sumOfArray(int[] array) {
        int sum = 0;
        int mean = 0;
        int last = 0;
        int middle =0;


        for (int i = 0; i < array.length; i++) {
            mean = mean + array[i];
            sum = sum + array[i];

        }
        mean = mean / array.length;
        System.out.println("մասիվի բոլոր թվերի միջին թվաբանականը " + mean);
        System.out.println("մասիվի էլեմենտների գումարը " + sum);
        System.out.println("մասիվի առաջին էլեմենտը " + array[0]);

        last = array[array.length - 1];
        System.out.println("մասիվի վերջին էլեմենտը " + last);


        middle = array[array.length / 2];


        System.out.println("մասիվի մեջտեղի էլեմենտը " + middle);

    }
}

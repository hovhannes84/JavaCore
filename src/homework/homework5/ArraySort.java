package homework.homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int tmp;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println("բոլոր էլեմենտները դասավորած են աճման կարգով ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j =0; j < numbers.length -1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    tmp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = tmp;
                }
            }

        }
        System.out.println();
        System.out.println("բոլոր էլեմենտները դասավորած են նվազման կարգով ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }

    }
}

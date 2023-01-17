package homework.homework7;

public class Calculator {

    int result;
    int plus(int x, int y) {
        return  x + y;

    }

    int minus(int x, int y) {
            return x - y;

    }

    int multiply(int x, int y) {
        return x * y;

    }

    int divide(int x, int y) {
        if (y == 0) {
            System.out.println("թիվը 0 ի չի բաժանվում ");
            return -1;
        }
        return  x / y;

    }

}

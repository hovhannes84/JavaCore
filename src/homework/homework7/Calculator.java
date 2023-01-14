package homework.homework7;

public class Calculator {
    int result;

    int plus(int x, int y) {
        result = x + y;
        return result;
    }

    int minus(int x, int y) {
        result = x - y;
        return result;
    }

    int multiply(int x, int y) {
        result = x * y;
        return result;
    }

    int divide(int x, int y) {
        if (y == 0) {
            System.out.println("թիվը 0 ի չի բաժանվում ");
            result = -1;
            return result;
        }
        result = x / y;
        return result;
    }

}

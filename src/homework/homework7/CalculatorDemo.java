package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator mycal = new Calculator();
        mycal.plus(8, 6);
        System.out.println(mycal.result);
        mycal.minus(25, 14);
        System.out.println(mycal.result);
        mycal.multiply(10, 13);
        System.out.println(mycal.result);
        mycal.divide(25, 0);
        System.out.println(mycal.result);
    }
}

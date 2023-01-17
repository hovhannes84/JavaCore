package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator mycal = new Calculator();
        System.out.println(mycal.plus(9,6));

        System.out.println(mycal.minus(14,5));

        System.out.println(mycal.multiply(11,8));

        System.out.println(mycal.divide(14,0));
    }
}

package chepter7.overload;

public class Overload {
    public static void main(String[] args) {
        OveloadDemo ob = new OveloadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);

    }
}

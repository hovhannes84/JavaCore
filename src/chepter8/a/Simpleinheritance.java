package chepter8.a;

public class Simpleinheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B supOb = new B();

        superOb.i = 10;
        superOb.j=20;
        System.out.println("Coдepжимoe объекта superOb:  ");
        superOb.showij();
        System.out.println();

        supOb.i = 7;
        supOb.j = 8;
        supOb.k = 9;

        System.out.println("Coдepжимoe объекта subOb:  ");
        supOb.showij();
        supOb.showk();

        System.out.println();
        System.out.println("Cyммa i j ,и k в объекте subOb");
        supOb.sum();



    }
}

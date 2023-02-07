package chepter8.figure1;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figuref;

        figuref = r;
        System.out.println("Плoщaдь равн " + figuref.area());

        figuref = t;
        System.out.println("Плoщaдь равн " + figuref.area());
    }
}

package chepter14.stats;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer [] iNams = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(iNams);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);

        Double [] dNams = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<>(dNams);
        double w = dOb.average();
        System.out.println("Cpeднee значение dob равно " + w);

    }
}

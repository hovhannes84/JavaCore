package chepter14.stats1;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer [] inums  = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("Cpeднee значение iob равн " + v);

        Double [] dNums = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<>(dNums);
        double w = dOb.average();
        System.out.println("Cpeднee значение dob равн " + w);

        Float [] fNums = {1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats <Float> fOb = new Stats<>(fNums);
        double x = fOb.average();
        System.out.println("Cpeднee значение fob равн " + x);

        System.out.print("Cpeдниe значения iob и dob ");
        if (iOb.sameAvg(dOb)){
            System.out.println("paвны ");
        }else {
            System.out.println("oтличaютcя");
        }
        System.out.print("Cpeдниe iob и fob ");
        if (iOb.sameAvg(fOb)){
            System.out.println("paвны");

        }else {
            System.out.println("oтличaютcя");
        }
    }
}

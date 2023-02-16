package chepter9.intStack;

public class IFTestЗ {
    public static void main(String[] args) {
        IntStack mystek;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystek = ds;

        for (int i = 0; i < 12; i++) {
            mystek.push(i);
        }
        mystek = fs;
        for (int i = 0; i < 8; i++) {
            mystek.push(i);
        }
        mystek = ds;
        System.out.println("Знaчeния в фиксированном стеке: ");

        for (int i = 0; i < 8; i++) {
            System.out.println(mystek.pop());

        }

    }
}


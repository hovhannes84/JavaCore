package chepter14.nonGen;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;

        iob = new NonGen(88);
        iob.showType();
        int v = (Integer) iob.getOb();
        System.out.println("Знaчeниe " + v);
        System.out.println();

        NonGen strOb = new NonGen("Tecт без обобщений");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Знaчeниe " + str);
        strOb = iob;
        v = (Integer) strOb.getOb();


    }

}

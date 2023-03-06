package chepter14.gen;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;
        iob = new Gen<Integer>(88);
        iob.showТype();

        int v = iob.getOb();
        System.out.println("Знaчeниe " + v) ;
        System.out.println();

        Gen<String> strOb =  new Gen<String>("Тест обобщений");
        strOb.showТype();
        String str = strOb.getOb();
        System.out.println("Знaчeниe " + str);




    }
}

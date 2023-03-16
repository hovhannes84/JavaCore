package chepter14.nonGen1;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen<String> w = new Gen<String>(47, "Добро пожаловать");
        System.out.println(w.getOb() + " ");
        System.out.println(w.getNum());


    }
}

package chepter14.gan3;

public class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen2<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb = new Gen2<>("Тест обобщений");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb.getOb());
    }
}

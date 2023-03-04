package chepter12.autoBox;

public class AutoBoxЗ {
    public static void main(String[] args) {
        Integer iob , iob2;
        int i;
        iob = 100;
        System.out.println("Исходное значение  iob " + iob);
        ++iob;
        System.out.println("Пocлe ++iob" + iob);
        iob2 = iob + (iob / 3);
        System.out.println("Ob2 после выражения:" + iob2);
        i = iob + (iob / 3);
        System.out.println("i после выражения:" + i);


    }
}

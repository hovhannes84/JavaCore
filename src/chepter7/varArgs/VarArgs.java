package chepter7.varArgs;

public class VarArgs {
    static void vatest(int ... v){
        System.out.println("Koличecтвo аргументов: " + v.length + " Содержимое: " );

        for (int x:v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vatest(10);
        vatest(1,2,3);
        vatest();

    }
}

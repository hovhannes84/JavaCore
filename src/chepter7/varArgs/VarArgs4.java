package chepter7.varArgs;

public class VarArgs4 {
    static void vatest(int ... v){
        System. out. print ( "vaтest ( int ... ) : " + "Количество аргументов: " + v.length + "Содержимое: ");

        for (int x:v) {
            System.out.print(x+ " ");
        }
        System.out.println();
    }
    static void vaтest(boolean ... v) {
        System.out.print("vaTest (boolean ... ) " + "Количество аргументов: " + v.length + "Содержимое: ");
        for (boolean x: v) {
            System.out.print(x + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vatest(1,2,3);
        vaтest(true,false,false);

    }
}

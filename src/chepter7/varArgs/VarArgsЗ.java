package chepter7.varArgs;

public class VarArgsЗ {
    static void vatest(int ... v){
        System.out.println("vatest(int ... v): " + "Количество аргументов: " + v.length + " одержимое: ");
        for (int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
    static void vatest(boolean ... v){
        System.out.print("vaTest(boolean ... )  " + "Количество аргументов: " + v.length + " одержимое:");

        for (boolean x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vates(String msg,int ... v){
        System.out.print("vaтest(String, int ... ) : " + msg + v.length + " одержимое: ");

        for (int x:v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vatest(1,2,3);
        vates("Проверка:  ",10,20);
        vatest(true,false,false);
    }

}

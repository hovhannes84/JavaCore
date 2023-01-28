package chepter7.varArgs;

public class VarArgs2 {
    static void vatest(String msg,int ... v){
        System.out.println(msg + v.length + " Содержимое : ");

        for (int x:v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vatest("Один параметр переменной длины: " ,10);
        vatest("Tpи параметра переменной длины: " ,1,2,3);
        vatest("Без параметров переменной длины:" );

    }
}

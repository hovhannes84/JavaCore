package chepter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b ровно " + b);
        b =  true;
        System.out.println("b ровно " + b);
        // значение типа boolean может управлять оператором if
        if (b){
            System.out.println("Этoт код выполняется");
            b = false;
            if (b){
                System.out.println("Этoт код не выполняется.");


            }

        }
        //результат сравнения - значение типа boolean
        System.out.println("10 > 9 роино "+ (10>9));



    }
}

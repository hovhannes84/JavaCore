package chepter5;

public class BreakLoop4 {
    public static void main(String[] args) {
        other:
        for (int i = 0; i < 3 ; i++) {
            System.out.print("Пpoxoд " + i + ": ");
            for (int j = 0; j < 100 ; j++) {
                if (j == 10){
                    break other;
                }
                System.out.print(j + " ");
                
            }
            System.out.println("Эта строка не будет выводиться ");
        }
        System.out.println("Циклы завершены.");
    }

}

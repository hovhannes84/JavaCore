package chepter7.outer;

public class outer2 {
    int outer_x =100;

    void test(){
        for (int i = 0; i <10 ; i++) {
            class Inner{
                void display(){
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }

        }

    }


}

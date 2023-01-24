package chepter7.outer;

public class Outer1 {
    int outer_x =100;

    void test(){
        Inner inner = new Inner();
        inner.display();

    }
    class Inner{
        int y =10;
        void display(){
            System.out.println("ывoд: outer_x = " + outer_x);
        }

    }

}

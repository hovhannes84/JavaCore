package chepter7.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack mysek1 = new Stack();
        Stack mysek2 = new Stack();

        for (int i = 0; i <10 ; i++) {
            mysek1.push(i);
        }
        for (int i = 10; i <20 ; i++) {
            mysek2.push(i);
        }
        System.out.println("Стек в mystackl: ");
        for (int i = 0; i <10 ; i++) {
            System.out.println(mysek1.pop());
        }
        System.out.println("Стек в mystack2:  ");
        for (int i = 0; i <10 ; i++) {
            System.out.println(mysek2.pop());
            
        }
    }
}

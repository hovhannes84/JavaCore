package chepter9.intStack;

public class IFTest {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i <5 ; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i <8 ; i++) {
            myStack2.push(i);
        }
        System.out.println("Cтeк в mystackl: ");
        for (int i = 0; i <5 ; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Cтeк в mystack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}

package chepter9.intStack;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystek1 = new DynStack(5);
        DynStack mystek2 = new DynStack(8);

        for (int i = 0; i <12 ; i++) {
            mystek1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystek2.push(i);
        }
        System.out.println("Cтeк в mystackl ");
        for (int i = 0; i <12 ; i++) {
            System.out.println(mystek1.pop());
        }
        System.out.println("Cтeк в mystack2 ");
        for (int i = 0; i <20 ; i++) {
            System.out.println(mystek2.pop());

        }
    }
}

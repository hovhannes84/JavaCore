package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dinArrey = new DynamicArray();
        dinArrey.add(5);
        dinArrey.add(8);
        dinArrey.add(14);
        dinArrey.add(78);
        dinArrey.add(75);
        dinArrey.add(98);
        dinArrey.add(65);
        dinArrey.add(25);
        dinArrey.add(2);
        dinArrey.add(5);
        dinArrey.add(11);
        dinArrey.add(17);
        dinArrey.add(75);
        dinArrey.add(65);
        dinArrey.add(25);
        dinArrey.add(2);
        dinArrey.add(5);
        dinArrey.add(11);
        dinArrey.add(17);
        dinArrey.add(21);
        dinArrey.add(33);

        dinArrey.print();
        System.out.println();

        System.out.print(dinArrey.getByIndex(6) + " ");
        System.out.println(dinArrey.getByIndex(-5));

        dinArrey.deleteByIndex(-4);
        dinArrey.deleteByIndex(6);
        dinArrey.deleteByIndex(8);
        dinArrey.deleteByIndex(1);

        dinArrey.set(5,40);


        dinArrey.add(-1,50);
        dinArrey.add(9,50);
        System.out.println(dinArrey.exists(7));
        System.out.println(dinArrey.exists(50));
        System.out.println(dinArrey.exists(33));
        System.out.println(dinArrey.getIndexByValue(17));
        dinArrey.print1();


    }
}

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
        dinArrey.add(-5);
        dinArrey.add(11);
        dinArrey.add(-17);
        dinArrey.add(75);
        dinArrey.add(98);
        dinArrey.add(65);
        dinArrey.add(25);
        dinArrey.add(2);
        dinArrey.add(-5);
        dinArrey.add(11);
        dinArrey.add(-17);
        dinArrey.add(21);
        dinArrey.add(33);

        dinArrey.print();
        System.out.println();

        System.out.print(dinArrey.getByIndex(30) + " ");
        System.out.println(dinArrey.getByIndex(7));


    }
}

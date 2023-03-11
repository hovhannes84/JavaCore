package homework.collectionExample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionExample2 {
    static Scanner scanner = new Scanner(System.in);
    static TreeSet<String> nameTree = new TreeSet<>();
    static HashSet<String> nameHash = new HashSet<>();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun){
            System.out.println("0 for exit");
            System.out.println("1 for add names");
            System.out.println("2 for add names");
            String comands = scanner.nextLine();
            try {
                switch (comands){
                    case "0":
                        isRun = false;
                        break;
                    case "1":
                        withoutRepetition();
                        break;
                    case "2":
                        sortNames();
                        break;
                }
            }catch (Exception e){
                System.out.println("please enter the correct command");
            }


        }

    }

    private static void sortNames() {
        System.out.println("enter 10 yin to get sorted list of names");
        for (int i = 0; i <10 ; i++) {
            System.out.println("please Enter name "+ (i+1) +" to save");
            String name = scanner.nextLine();
            nameTree.add(name);
        }
        for (String s : nameTree) {
            System.out.println(s);

        }

    }

    private static void withoutRepetition() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("piease enter june "  + (i+1) + " st from pita");
            String name = scanner.nextLine();
            if (!nameHash.contains(name)) {
                nameHash.add(name);
            }

        }
        for (String hash : nameHash) {
            System.out.println(hash);

        }

    }
}

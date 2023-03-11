package homework.collectionExample;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> nameList = new ArrayList<>();

    public static void main(String[] args) {

        nameList.add("Aram");
        nameList.add("Vazgen");
        nameList.add("Karen");
        nameList.add("Vahan");
        nameList.add("Arsen");
        try {
            boolean isRun = true;
            while (isRun) {
                System.out.println("0 for exit");
                System.out.println("1 for to find out if there is a name");
                System.out.println("2 for to delete the entered name");
                System.out.println("3 for to save the name in the visible index");
                String comands = scanner.nextLine();
                switch (comands) {
                    case "0":
                        isRun = false;
                        break;
                    case "1":
                        checkName();
                        break;
                    case "2":
                        deleteName();
                        break;
                    case "3":
                        nameToDesiredIndex();
                        break;
                }

            }

        } catch (Exception e) {
            System.out.println("please enter the correct command");
        }


    }

    private static void nameToDesiredIndex() {
        System.out.println("Enter your name,index");
        String cons = scanner.nextLine();
        String[] str = cons.split(",");
        nameList.add(Integer.parseInt(str[1]), str[0]);
        for (String s : nameList) {
            System.out.println(s);
        }


    }

    private static void deleteName() {
        System.out.println("Enter your name:");
        String cons = scanner.nextLine();
        if (nameList.contains(cons)) {
            nameList.remove(cons);
        } else {
            System.out.println("this name was not found");
        }


        for (String s : nameList) {
            System.out.println(s);
        }


    }

    private static void checkName() {
        System.out.println("Enter your name:");
        String cons = scanner.nextLine();

        if (nameList.contains(cons)) {
            System.out.println("this name found");
        } else {
            System.out.println("this name was not found");
        }

    }

}

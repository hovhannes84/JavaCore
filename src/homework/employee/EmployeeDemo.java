package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;
        while (isRun){
            System.out.println("Please input 0 for exit ");
            System.out.println("Please input 1 add employee ");
            System.out.println("Please input 2 print all employee");
            System.out.println("Please input 3 search employee by employee ID ");
            System.out.println("Please input 4 search employee by company name ");
            String command = scanner.nextLine();

            switch (command){
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employees' name ");
                    String name = scanner.nextLine();
                    System.out.println("Please input employees' surname ");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employees' emplyeeID ");
                    String emplyeeID = scanner.nextLine();
                    System.out.println("Please input employees' salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input employees' company");
                    String company = scanner.nextLine();
                    System.out.println("Please input employees' position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name,surname,emplyeeID,company,Double.parseDouble(salary),Double.parseDouble(position));
                    employeeStorage.add(employee);
                    System.out.println("employee is created");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchEmplyeeID(keyword);
                    break;
                case "4":
                    System.out.println("Please input keyword");
                    String keyword1 = scanner.nextLine();
                    employeeStorage.searchCompany(keyword1);

                    break;
                default:
                    System.out.println("Wrong command.Please try again.");


            }


        }
    }

}

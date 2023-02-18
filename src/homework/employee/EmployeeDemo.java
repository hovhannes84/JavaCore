package homework.employee;

import homework.employee.employee.Employee;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit ");
            System.out.println("Please input 1 add employee ");
            System.out.println("Please input 2 print all employee");
            System.out.println("Please input 3 search employee by employee ID ");
            System.out.println("Please input 4 search employee by company name ");
            System.out.println("Please input 5 for search employee by salary range ");
            System.out.println("Please input 6 for change employee position by id ");
            System.out.println("Please input 7 for print only active employees ");
            System.out.println("Please input 8 for inactive employee by id ");
            System.out.println("Please input 9 for activate employee by id ");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    one();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    three();
                    break;
                case "4":
                    four();
                    break;
                case "5":
                    five();
                    break;
                case "6":
                    six();
                    break;
                case "7":
                    employeeStorage.printonlyactive();
                    break;
                case "8":
                    eight();
                    break;
                case "9":
                    nine();
                    break;
                default:
                    System.out.println("Wrong command.Please try again.");

            }

        }
    }

    private static void nine() {
        System.out.println("Please input id");
        String id = scanner.nextLine();
        employeeStorage.activate(id);
    }

    private static void eight() {
        System.out.println("Please input id");
        String id = scanner.nextLine();
        employeeStorage.inactive(id);
    }

    private static void six() {
        System.out.println("Please input employee id");
        String id = scanner.nextLine();
        System.out.println("position for change employee ");
        String position = scanner.nextLine();
        employeeStorage.positionchange(id, position);
    }

    private static void five() {
        System.out.println("Please input salary range");
        String min = scanner.nextLine();
        String max = scanner.nextLine();
        employeeStorage.rang(Double.parseDouble(min), Double.parseDouble(max));
    }

    private static void four() {
        System.out.println("Please input keyword");
        String keyword1 = scanner.nextLine();
        employeeStorage.searchCompany(keyword1);
    }

    private static void three() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        Employee employee = employeeStorage.searchEmplyeeID(keyword);
        if (employee == null) {
            System.out.println("employee with " + keyword + " id dois not exist ");
        } else {
            System.out.println(employee);
        }
    }

    private static void one() throws ParseException {
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
        System.out.println("Please input date(14/02/2023)");
        String dateOfB = scanner.nextLine();
        Date dateOfBirthday = DateUtil.stringToDate(dateOfB);
        Date registerDate = new Date();

        Employee employee = new Employee(name, surname, emplyeeID, company, Double.parseDouble(salary),position,registerDate,dateOfBirthday);
        employeeStorage.add(employee);
        System.out.println("employee is created");
    }

}

package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class EmployeeDemo implements Comands{
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();
    private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            Comands.printComands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    one();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    three();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    companyStorage.print();
                    four();
                    break;
                case SEARCH_EMPLOYEE_BY_SELARY_RANGE:
                    five();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    six();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printonlyactive();
                    break;
                case INACTIVATE_EMPLOYEE_BY_ID:
                    eight();
                    break;
                case ACTIVE_EMPLOYEE_BY_ID:
                    nine();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("Wrong command.Please try again.");

            }

        }
    }

    private static void addCompany() {
        System.out.println("Plise input id,name,address,phonenamper");
        String companyDataStr = scanner.nextLine();
        String [] companyData  = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyByID(companyId);
        if (companyById == null){
            Company company = new Company(companyId,companyData[1],companyData[2],companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added!");
        }else {
            System.out.println("Company with " + companyId + " already exists");
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
        String companiId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyByID(companiId);
        if (companyById != null){
            employeeStorage.searchCompany(companyById);
        }else {
            System.out.println("Company does not exist!");
        }

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
        if (companyStorage.getSize()==0){
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyByID(companyId);
        if (companyById != null){
            System.out.println("Please input employees' name ");
            String name = scanner.nextLine();
            System.out.println("Please input employees' surname ");
            String surname = scanner.nextLine();
            System.out.println("Please input employees' emplyeeID ");
            String emplyeeID = scanner.nextLine();
            System.out.println("Please input employees' salary");
            String salary = scanner.nextLine();
            System.out.println("Please input employees' position");
            String position = scanner.nextLine();
            System.out.println("Please input date(14/02/2023)");
            String dateOfB = scanner.nextLine();
            Date dateOfBirthday = DateUtil.stringToDate(dateOfB);
            Date registerDate = new Date();

            Employee employee = new Employee(name, surname, emplyeeID, companyById, Double.parseDouble(salary),position,registerDate,dateOfBirthday);
            employeeStorage.add(employee);
            companyById.setEmployeeCount(companyById.getEmployeeCount()+1);
            System.out.println("employee is created");
        }else {
            System.out.println("Wrong company id! please try again ");
        }

    }

}

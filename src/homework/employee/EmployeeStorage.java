package homework.employee;

public class EmployeeStorage {
    private Employee [] array = new Employee [10];
    private int size = 0;


    public void add(Employee value) {

        if (size >= array.length - 1) {
            extend();
            array[size++] = value;
        }
        array[size++] = value;

    }


    private void extend() {
        Employee [] extend = new Employee [array.length + 10];
        for (int i = 0; i < array.length; i++) {
            extend[i] = array[i];
        }
        array = extend;

    }


    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(array[i] + " ");
        }

    }
    public void searchEmplyeeID(String keyword){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().contains(keyword)){
                found = true;
                System.out.println(employee);
            }

        }
        if (!found){
            System.out.println("employee with " + keyword + " does not exists ");
        }
    }
    public void searchCompany(String keyword1){
        boolean found = false;
        for (int i = 0; i <size ; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(keyword1)){
                found = true;
                System.out.println(employee);
            }

        }
        if (!found){
            System.out.println("employee with " + keyword1 + " does not exists ");
        }
    }

}

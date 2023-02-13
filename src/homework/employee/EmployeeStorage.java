package homework.employee;

public class EmployeeStorage {
    private Employee [] array = new Employee [10];
    private int size = 0;



    public void add(Employee value) {

        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }


    private void extend() {
        Employee [] extend = new Employee [array.length + 10];
        System.arraycopy(array, 0, extend, 0, size);
        array = extend;

    }


    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(array[i] + " ");
        }

    }
    public Employee searchEmplyeeID(String keyword){
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().equals(keyword)){
                return array[i];
            }
        }
        return null;
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
    public void  rang (double min,double max){
        for (int i = 0; i <size; i++) {
            Employee employee = array[i];
            if (employee.getSalary() > min && employee.getSalary()<max){
                System.out.println(employee);
            }else {
                System.out.println("range is empty ");
            }


        }
    }
    public void positionchange(String id,String position){
        boolean found = false;
        for (int i = 0; i <size ; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().equals(id)){
                employee.setPosition(position);
                found = true;
                System.out.println(employee);
            }
        }
        if (!found){
            System.out.println("id not found ");
        }

    }
    public  void inactive(String id){
        boolean found = false;
        for (int i = 0; i <size ; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().equals(id)){
                employee.setActive(false);
                found = true;
                System.out.println(employee);
            }

        }
        if (!found){
            System.out.println("id not found ");
        }
    }
    public void activate(String id){
        boolean found =false;
        for (int i = 0; i <size ; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().equals(id) && employee.isActive()==false){
                employee.setActive(true);
                found = true;
                System.out.println(employee);
            }

        }
        if (!found) {
            System.out.println("id not found ");
        }
    }
    public  void  printonlyactive(){
        boolean found =false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.isActive() == true ){
                found = true;
                System.out.println(employee);
            }
        }
        if (!found){
            System.out.println("not found");
        }

    }



}

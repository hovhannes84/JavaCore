package homework.employee;

import java.util.Objects;

class Employee {
   private String name;
   private String surname;
   private String emplyeeID;
   private String company;
   private double salary;
   private double position;

    public Employee(){

    }
    public Employee(String name,String surname,String emplyeeID,String company,double salary,double position){
        this.name = name;
        this.surname = surname;
        this.emplyeeID = emplyeeID;
        this.company = company;
        this.salary = salary;
        this.position  = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmplyeeID() {
        return emplyeeID;
    }

    public void setEmplyeeID(String emplyeeID) {
        this.emplyeeID = emplyeeID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                position == employee.position &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(emplyeeID, employee.emplyeeID) &&
                Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, emplyeeID, company, salary, position);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeID='" + emplyeeID + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }


}

package homework.employee;

import java.util.Objects;

class Employee {
    private String name;
    private String surname;
    private String emplyeeID;
    private String company;
    private double salary;
    private String position;
    private boolean active = true;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeID='" + emplyeeID + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", active=" + active +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return active == employee.active;
    }

    @Override
    public int hashCode() {

        return Objects.hash(active);
    }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public Employee() {

    }

    public Employee(String name, String surname, String emplyeeID, String company, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.emplyeeID = emplyeeID;
        this.company = company;
        this.salary = salary;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}

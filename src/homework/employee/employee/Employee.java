package homework.employee.employee;

import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Objects;


public class Employee {
    Date date = new Date();


    private String name;
    private String surname;
    private String emplyeeID;
    private String company;
    private double salary;
    private String position;
    private boolean active = true;
    private Date registerDate  ;
    private Date dateOfBirthday;

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeID='" + emplyeeID + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", registerDate='" + DateUtil.dateToString(registerDate) + '\'' +
                ", dateOfBirthday='" + DateUtil.dateToString(dateOfBirthday) + '\'' +

                '}';
    }


    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public Employee(String name, String surname, String emplyeeID, String company, double salary, String position,Date registerDate,Date dateOfBirthday) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.emplyeeID = emplyeeID;
        this.company = company;
        this.salary = salary;
        this.position = position;
        this.registerDate = registerDate;
        this.dateOfBirthday = dateOfBirthday;

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

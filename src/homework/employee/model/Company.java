package homework.employee.model;

import java.util.Objects;

public class Company {

    private String id;
    private String name;
    private String address;
    private String phoneNamber;
    private int employeeCount;

    public Company(String id, String name, String address, String phoneNamber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNamber = phoneNamber;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNamber() {
        return phoneNamber;
    }

    public void setPhoneNamber(String phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Company() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return employeeCount == company.employeeCount &&
                Objects.equals(id, company.id) &&
                Objects.equals(name, company.name) &&
                Objects.equals(address, company.address) &&
                Objects.equals(phoneNamber, company.phoneNamber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, address, phoneNamber, employeeCount);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNamber='" + phoneNamber + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}

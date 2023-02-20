package homework.employee.storage;

import homework.employee.model.Company;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;


    public void add(Company company) {

        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;

    }

    private void extend() {
        Company[] extend = new Company[companies.length + 10];
        System.arraycopy(companies, 0, extend, 0, size);
        companies = extend;

    }


    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(companies[i] + " ");
        }

    }

    public Company getCompanyByID(String id) {
        for (int i = 0; i < size; i++) {
            Company company = companies[i];
            if (company.getId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }
    public int getSize(){
        return size;
    }

}



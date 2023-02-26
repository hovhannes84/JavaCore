package homework.medicalCenter.model;

import java.util.Objects;

public class Doctor extends Person {
    String email;
    Enum profesion;

    public Doctor() {
    }

    public Doctor(String id, String name, String surname, String email, String phoneNumber, Enum profession ) {
        this.email = email;
        this.profesion = profession;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum getProfession() {
        return profesion;
    }

    public void setProfession(Enum profession) {
        this.profesion = profession;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) &&
                Objects.equals(profesion, doctor.profesion);
    }

    @Override
    public int hashCode() {

        return Objects.hash(email, profesion);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession='" + profesion + '\'' +
                "} " + super.toString();
    }
}

package homework.medicalCenter.medStorage;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {
    Date date = new Date();

    private Person[] persons = new Person[10];
    private int size = 0;


    public void addPerson(Person person) {

        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;

    }


    private void extend() {
        Person[] extend = new Person[persons.length + 10];
        System.arraycopy(persons, 0, extend, 0, size);
        persons = extend;

    }


    public void printDoctor() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                System.out.println(person);
            }
        }

    }

    public void printPatient() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                System.out.println(person);
            }
        }

    }


    public Doctor getDoctorByID(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getId().equals(id)) {
                    return doctor;
                }
            }

        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public void searchDoctorByProfession(Enum profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession() == profession) {
                    System.out.println(doctor);
                } else System.out.println("doctor with " + profession + " id dois not exist ");


            }
        }

    }

    public void delliteDoctor(String doctorId) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person.getId().equals(doctorId) && person instanceof Doctor) {
                deleteByIndex(i);

            }
        }

    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    public Doctor changeDoctor(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person.getId().equals(id) && person instanceof Doctor) {

                return (Doctor) person;
            }
        }
        return null;
    }

    public void printAllPatientByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }

        }
    }

    public Patient patientEcuals(Date registrTime) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getRegisterDateTime().equals(registrTime)) {
                    System.out.println("this time is busy");
                    return patient;
                }
            }
        }
        return null;
    }

    public void printTodeys() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                String str = DateUtil.dateToString(patient.getRegisterDateTime());
                String[] dateStr = str.split("/");
                String str1 = DateUtil.dateToString(date);
                String[] dateStr1 = str1.split("/");
                if (dateStr[0].equals(dateStr1[0])) {
                    System.out.println(patient);
                } else {
                    System.out.println("no entries for today");
                }

            }


        }

    }
}
package homework.medicalCenter.medStorage;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {
    Date date = new Date();

    private Doctor[] doctors = new Doctor[10];
    private int size = 0;

    private Patient[] patients = new Patient[10];
    private int patientSize =0;



    public void addDoctor(Doctor doctor) {

        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;

    }
    public void addPatient(Patient patient) {

        if (size == patients.length) {
            extend1();
        }
        patients[patientSize++] = patient;

    }



    private void extend() {
        Doctor[] extend = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, extend, 0, size);
        doctors = extend;

    }
    private void extend1() {
        Patient[] extend1 = new Patient[doctors.length + 10];
        System.arraycopy(patients, 0, extend1, 0, size);
        patients = extend1;

    }



    public void printDoctor() {
        for (int i = 0; i < size; i++) {

            System.out.println(doctors[i] + " ");
        }

    }
    public void printPatient() {
        for (int i = 0; i < patientSize; i++) {

            System.out.println(patients[i] + " ");
        }

    }


    public Doctor getDoctorByID(String id) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = doctors[i];
            if (doctor.getId().equals(id)) {
                return doctors[i];
            }
        }
        return null;
    }
    public int getSize(){
        return size;
    }

    public Doctor searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = doctors[i];
            if (doctor.getProfession().equals(profession)){
                return doctors[i];
            }
        }
        return null;
    }

    public Doctor delliteDoctor(String doctorId){

        for (int i = 0; i <size ; i++) {
            Doctor doctor = doctors[i];
            if (doctor.getId().equals(doctorId)){
                doctors[i] = doctors[i+1];
                return null;
            }
        }
        size--;
        return null;
    }
    public Doctor changeDoctor(String id){
        for (int i = 0; i <size ; i++) {
            Doctor doctor = doctors[i];
            if (doctor.getId().equals(id)){
                return doctors[i];
            }
        }return null;
    }
    public Patient patientEcuals(Date registrTime){
        for (int i = 0; i <patientSize ; i++) {
            Patient patient = patients[i];
            if (patient.getRegisterDateTime().equals(registrTime)){
                System.out.println("this time is busy");
                return patients[i];
            }

        }return null;
    }

    public void printTodeys() {
        for (int i = 0; i <patientSize ; i++) {
            Patient patient = patients[i];
            String str = DateUtil.dateToString(patient.getRegisterDateTime());
            String []dateStr = str.split("/");
            String str1 = DateUtil.dateToString(date);
            String []dateStr1 = str1.split("/");
            if (dateStr[0].equals(dateStr1[0])){
                System.out.println(patients[i]);
            }else {
                System.out.println("no entries for today");
            }

        }

    }

}

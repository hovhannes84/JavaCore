package homework.medicalCenter;

import homework.medicalCenter.medStorage.PersonStorage;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.util.Comands;
import homework.medicalCenter.util.DateUtil;

import java.util.Date;
import java.util.Scanner;

public class MedCenterMain implements Comands {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();
    private static Patient patient = new Patient();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun){
            Comands.printComanands();
            String comands = scanner.nextLine();

            switch (comands){
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    serchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    delleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODEYS_PATIENTS:
                    printTodeysPatients();
                    break;
            }

        }

    }

    private static void printTodeysPatients() {
        personStorage.printTodeys();

    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctor();
        personStorage.printPatient();
    }

    private static void addPatient() {
        personStorage.printDoctor();
        System.out.println("Please input doctorid");
        String doctorid = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorByID(doctorid);
        if (doctorById != null){
            System.out.println("Plise input id, name, surname,phoneNumber,date(14/02/2023 12:10)");
            String patientDataStr = scanner.nextLine();
            String [] patientData  = patientDataStr.split(",");
            Date registerDateTime = DateUtil.stringToDate(patientData[4]);
            if (personStorage.patientEcuals(registerDateTime) == null){
                Patient patient = new Patient(patientData[0],patientData[1],patientData[2],patientData[3],doctorById,registerDateTime);
                personStorage.addPatient(patient);
                System.out.println("your queue is registered");
            }else {
                addPatient();
            }

        }else {
            System.out.println("there is no such doctor try again ");
        }
    }

    private static void changeDoctorDataById(){
        personStorage.printDoctor();
        System.out.println("Please input doctorid");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.changeDoctor(id);
        if (doctor == null){
            System.out.println("doctor with " + id + "  dois not exist ");
        }
        System.out.println("Plise input name, surname, email, phoneNumber, profession");
        String doctorDataStr = scanner.nextLine();
        String [] doctorData  = doctorDataStr.split(",");
        doctor.setName(doctorData[0]);
        doctor.setSurname(doctorData[1]);
        doctor.setEmail(doctorData[2]);
        doctor.setPhoneNumber(doctorData[3]);
        doctor.setProfession(doctorData[4]);
        System.out.println("change doctor data");
    }


    private static void delleteDoctorById(){
        personStorage.printDoctor();
        System.out.println("Please input doctorid");
        String doctorId = scanner.nextLine();
        Doctor doctor = personStorage.delliteDoctor(doctorId);
        System.out.println("doctor removed from medical center");

    }

    private static void serchDoctorByProfession() {
        personStorage.printDoctor();
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        Doctor doctor = personStorage.searchDoctorByProfession(profession);
        if (doctor == null) {
            System.out.println("doctor with " + profession + " id dois not exist ");
        } else {
            System.out.println(doctor);
        }
    }

    private static void addDoctor() {
        System.out.println("Plise input id, name, surname, email, phoneNumber, profession");
        String doctorDataStr = scanner.nextLine();
        String [] doctorData  = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorByID(doctorId);
        if (doctorById == null){
            Doctor doctor = new Doctor(doctorId,doctorData[1],doctorData[2],doctorData[3],doctorData[4],doctorData[5]);
            personStorage.addDoctor(doctor);
            System.out.println("Doctor was added!");
        }else {
            System.out.println("Doctor with " + doctorId + " already exists");
        }
    }


}

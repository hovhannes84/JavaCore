package homework.medicalCenter.util;

public interface Comands {
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID ="3";
    String CHANGE_DOCTOR_DATA_BY_ID ="4";
    String ADD_PATIENT ="5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR ="6";
    String PRINT_TODEYS_PATIENTS = "7";

    static void printComanands(){
        System.out.println("Please input " + EXIT + " for exit ");
        System.out.println("Please input " + ADD_DOCTOR + " for add doctor ");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for search doctor by profession ");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for delete doctor by id");
        System.out.println("Please input " + CHANGE_DOCTOR_DATA_BY_ID + " for change doctor data by id ");
        System.out.println("Please input " + ADD_PATIENT + " for add patient ");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for print all  patients by doctor ");
        System.out.println("Please input " + PRINT_TODEYS_PATIENTS + " for print todays patients ");
    }

    String FAMILY_PHYSICIANS = "1";
    String INTERNISTS = "2";
    String EMERGENCY_PHYSICIANS = "3";
    String PSYCHIATRISTS = "4";

    static void printComanandsProfesion(){
        System.out.println("Please input " + FAMILY_PHYSICIANS + " to choose a profession FAMILY_PHYSICIANS");
        System.out.println("Please input " + INTERNISTS + " to choose a profession INTERNISTS ");
        System.out.println("Please input " + EMERGENCY_PHYSICIANS + " to choose a profession EMERGENCY_PHYSICIANS");
        System.out.println("Please input " + PSYCHIATRISTS + " to choose a profession PSYCHIATRISTS");
    }

}

package othertests.enumexample;

public enum Profession {

     PSYCHOLOGIST ("Gyumri") ,
    CARDIOLOGIST ("Astghik"),
     DENTIST("Erebuni"),
     OPTOMETRIST("Hanrapetakan"),
    NEUROLOGIST("Nairi"),
    THERAPIST("Izmirlyan");
     private String clinic;
     // ete uzem hatkutyun tam perq e String clinic tak grem private String hatkutyun u konstruktori mej , dnem u grem hatkutyun

    Profession(String clinic) {
        this.clinic = clinic;
    }

    public String getClinic() {
        return clinic;
    }
}

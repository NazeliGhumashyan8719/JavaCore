package mytests.enumexample;

public enum Profession {

     PSYCHOLOGIST ("Gyumri") ,
    CARDIOLOGIST ("Astghik"),
     DENTIST("Erebuni"),
     OPTOMETRIST("Hanrapetakan"),
    NEUROLOGIST("Nairi"),
    THERAPIST("Izmirlyan");
     private String clinic;
     // ete uzem xndzorin guyn tam perq e String clinic tak grem private String color u konstruktori mej , dnem u grem color

    Profession(String clinic) {
        this.clinic = clinic;
    }

    public String getClinic() {
        return clinic;
    }
}

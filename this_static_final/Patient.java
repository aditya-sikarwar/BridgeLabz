public class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid object. Not a Patient.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("David", 40, "Fever", 201);
        Patient p2 = new Patient("Eva", 30, "Fracture", 202);

        p1.displayDetails(p1);
        p2.displayDetails(p2);

        Patient.getTotalPatients();
    }
}

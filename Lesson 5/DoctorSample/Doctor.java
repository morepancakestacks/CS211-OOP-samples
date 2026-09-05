public class Doctor {
    String name;
    String specialization;

    public Doctor (String name, String specialization) {
        this.name = name;
        this. specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Doctor's name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    public void treatPatient() {
        System.out.println("The doctor is treating a patient.");
    }
}
public class Surgeon extends Doctor {

    String hospitalName;

    public Surgeon(String name, String specialization, String hospitalName) {
        // Call Doctor constructor
        super(name, specialization);
        this.hospitalName = hospitalName;
    }

    @Override
    public void treatPatient() {
        System.out.println("The surgeon is performing surgery on a patient.");
    }

    public void performSurgery() {
        System.out.println("The surgeon successfully completes the operation.");
    }
}

public class Cardiologist extends Doctor {
    String hospital;

    public Cardiologist(String name, String specialization, String hospital) {
        super(name, specialization);
        this.hospital = hospital;
    }

    @Override
    public void treatPatient() {
        System.out.println("The cardiologist is checking the patient's heart rate and ECG.");
    }

    public void performECG() {
        System.out.println("The cardiologist performs an ECG test on the patient.");
    }
}

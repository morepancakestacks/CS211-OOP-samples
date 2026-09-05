public class Optometrist extends Doctor {

    String clinicName;

    public Optometrist(String name, String specialization, String clinicName) {
        // Call the superclass (Doctor) constructor using 'super'
        super(name, specialization);
        this.clinicName = clinicName;
    }

   @Override
    public void treatPatient() {
        System.out.println("The optometrist is examining the patient's eyes.");
    }

    public void prescribeGlasses() {
        System.out.println("The optometrist prescribes a new pair of glasses.");
    }
}
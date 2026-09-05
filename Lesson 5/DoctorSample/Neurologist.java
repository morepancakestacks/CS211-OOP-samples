public class Neurologist extends Doctor {
    String researchField;

    public Neurologist(String name, String specialization, String researchField) {
        super(name, specialization);
        this.researchField = researchField;
    }

    @Override
    public void treatPatient() {
        System.out.println("The neurologist is examining the patient's nervous system.");
    }

    public void conductBrainScan() {
        System.out.println("The neurologist conducts a brain scan for diagnosis.");
    }
}

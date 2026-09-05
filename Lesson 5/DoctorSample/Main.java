class Main {
    public static void main(String[] args) {

        // Create a new doctor
        Doctor doctor = new Doctor("Dr. C", "General Medicine");
        doctor.displayDetails();
        doctor.treatPatient();

        System.out.println();

        // Create a new optometrist
        Optometrist optometrist = new Optometrist("Dr. A", "Optometry", "Executive Optical");
        optometrist.displayDetails();
        optometrist.treatPatient();
        optometrist.prescribeGlasses();

        System.out.println();

        // Create a new surgeon
        Surgeon surgeon = new Surgeon("Dr. J", "Surgery", "Batangas Medical Center");
        surgeon.displayDetails();
        surgeon.treatPatient();
        surgeon.performSurgery();

        Cardiologist cardiologist = new Cardiologist("Dr. Z", "Cardiology", "Metro Heart Center");
        cardiologist.displayDetails();
        cardiologist.treatPatient();
        cardiologist.performECG();

        Neurologist neurologist = new Neurologist("Dr. V", "Neurology", "Brain Research Institute");
        neurologist.displayDetails();
        neurologist.treatPatient();
        neurologist.conductBrainScan();
    }
}
```mermaid
classDiagram
    class Doctor {
        - name : String
        - specialization : String
        + Doctor(name : String, specialization : String)
        + displayDetails() : void
        + treatPatient() : void
    }

    class Optometrist {
        - clinicName : String
        + Optometrist(name : String, specialization : String, clinicName : String)
        + treatPatient() : void
        + prescribeGlasses() : void
    }

    class Surgeon {
        - hospitalName : String
        + Surgeon(name : String, specialization : String, hospitalName : String)
        + treatPatient() : void
        + performSurgery() : void
    }

    class Cardiologist {
        - hospital : String
        + Cardiologist(name : String, specialization : String, hospital : String)
        + treatPatient() : void
        + performECG() : void
    }

    class Neurologist {
        - researchField : String
        + Neurologist(name : String, specialization : String, researchField : String)
        + treatPatient() : void
        + conductBrainScan() : void
    }

    Doctor <|-- Optometrist
    Doctor <|-- Surgeon
    Doctor <|-- Cardiologist
    Doctor <|-- Neurologist
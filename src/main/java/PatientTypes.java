public enum PatientTypes {
    HUMAN("human_patients.txt", "human_problems.txt"),
    PET("pet_patients.txt", "pet_problems.txt");

    private String patientNames;
    private String patientProblems;

    PatientTypes(String patientNames, String patientProblems) {
        this.patientNames = patientNames;
        this.patientProblems = patientProblems;
    }

    public String getPatientNames() {
        return patientNames;
    }

    public String getPatientProblems() {
        return patientProblems;
    }
}

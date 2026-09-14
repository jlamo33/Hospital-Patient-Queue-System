public class Patient {

    // fields for node class (Patient class is a Node)

    private String patientName;
    private Patient next;
    private Patient prev;

    // metrics , {Patient ID number , severity for priority queue, and patient arrival time}
    private int severity;
    private int arrivalTime;
    private int patientID;


    public Patient(String name, int ID, int severity) {

        patientName = name;
        patientID = ID;
        this.severity = severity;
    }

    public String getPatientName() {

        return this.patientName;
    }

    public int getPatientID() {

        return patientID;
    }

    public int getSeverity() {

        return severity;
    }

    public Patient getNext() {

        return this.next;
    }

    public Patient getPrev() {

        return this.prev;
    }

    public void setNextPatient(Patient nextPatient) {

        this.next = nextPatient;
    }

    public void setPrevPatient(Patient prevPatient) {

        this.prev = prevPatient;
    }



}

public class Patient {

    // fields for node class (Patient class is a Node)

    String patientName;
    Patient next;
    Patient prev;

    // metrics , {Patient ID number , severity for priority queue, and there arrival time}
    int severity;
    int arrivalTime;
    int patientID;


    public Patient(String name, int ID) {

        patientName = name;
        patientID = ID;
    }
    
    public String getPatientName() {

        return this.patientName;
    }

    public int getPatientID() {

        return patientID;
    }

}

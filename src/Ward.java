public class Ward {

    private String wardName;
    private Patient head;
    private Patient tail;

    private int length;



    public Ward(String wardName) {
        this.wardName = wardName;
    }

    public void printPatientQueue() {

        Patient temp = head;
        while(temp != null) {
            System.out.print(temp.getPatientName() + " ID " + temp.getPatientID());
            System.out.print("\t");
            temp = temp.getNext();
        }
    }

    private boolean isWardEmpty() {

        return length == 0;
    }

    public void admitPatient(String name, int ID, int severity) {

        // create a new Patient node
        Patient p1 = new Patient(name, ID, severity);

        // check if the ward has zero patients
        if(isWardEmpty()) {

            head = p1;
            tail = p1;
        }

        else {

            // link nodes
            tail.setNextPatient(p1);
            p1.setPrevPatient(tail);

            // update the tail
            tail = p1;

        }

        length++;

    }

    public int countPatients() {

        return length;
    }

    public String peekNext() {

        return head.getPatientName();
    }

    public void takeNextPatient() {

        if(isWardEmpty()) {
            return;
        }

        else if(length == 1) {
            head = null;
        }

        else {

            // remove link and update head to next patient in queue
            Patient temp = head;
            head = temp.getNext();
            temp.setNextPatient(null);
            length--;
        }


    }

    public void dischargePatient(int patientID) {

        if(isWardEmpty()) {

            return;
        }

        Patient temp = head;

        // perform a linear search to the patient with patient ID number
        for(int i = 0; i < countPatients(); i++) {

            if (patientID == temp.getPatientID()) {

                break;
            }

            temp = temp.getNext();

        }

        Patient before = temp.getPrev();
        Patient after = temp.getNext();

        // only patient on the list
        if(head == tail) {
            head = null;
            tail = null;
        }

        // if the patient is the first in the queue
        else if(temp == tail) {

            temp.setPrevPatient(null);
            tail = before;
        }

        // if the patient is the last in the queue
        else if(temp == head) {

            after.setPrevPatient(null);
            head = after;
        }

        else {

            before.setNextPatient(after);
            after.setPrevPatient(before);

        }

        temp.setNextPatient(null);
        temp.setPrevPatient(null);
        temp = null;
    }

    public void sortPatientsBySeverity() {


    }

    public void insertBySeverity(String patientName, int ID, int severity) {

        // create new patient node
        Patient p1 = new Patient(patientName, ID, severity);


    }


    public void buildSeverityTable() {


    }


}

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
        Patient p1 = new Patient(name, ID);

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
}

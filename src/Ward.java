public class Ward {

    private String wardName;
    private Patient head;
    private Patient tail;

    private int length;



    public Ward(String wardName) {
        this.wardName = wardName;
    }

    public void admitPatient(String name, int ID, int severity) {

        // create a new Patient node
        Patient p1 = new Patient(name, ID);

        if(length == 0) {

            head = p1;
            tail = p1;
        }

        // link nodes
        tail.setNextPatient(p1);
        p1.setPrevPatient(tail);

        // update the tail
        tail = p1;

        length++;

    }


}

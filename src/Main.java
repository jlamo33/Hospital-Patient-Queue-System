public class Main {
    public static void main(String[] args) {

        Ward w1 = new Ward("Ward Joshua");
        w1.admitPatient("John Doe", 1010, 1);
        w1.admitPatient("John Deer", 1202, 2);
        w1.admitPatient("Joe Smith", 2929, 8);
        w1.printPatientQueue();
        System.out.print("\n\n");
        w1.dischargePatient(1202);
        w1.printPatientQueue();
    }
}
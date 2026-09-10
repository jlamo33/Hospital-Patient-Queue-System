public class Main {
    public static void main(String[] args) {

        Ward w1 = new Ward("Ward Joshua");
        w1.admitPatient("John Doe", 1010, 1);
        w1.admitPatient("John Deer", 0100, 2);
        w1.takeNextPatient();
        w1.printPatientQueue();
    }
}
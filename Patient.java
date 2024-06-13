import java.util.List;

public class Patient extends Person {
    private int pid = 0;

    Patient(String Name, String Address, String Nic, String Contact) {
        super(Name, Address, Nic, Contact);
        this.pid += 1;
    }

    int getId() {
        return this.pid;
    }

    void addPatient(String Name, String Address, String Nic, String Contact, List<Patient> patients) {
        Patient p1 = new Patient(Name, Address, Nic, Contact);
        patients.add(p1);
        System.out.println("Add new Patient with ID: " + p1.getId());
    }

}



import java.util.List;

public class Staff extends Person {
    private String position;
    private String type;

    Staff(String Name, String Address, String Nic, String Contact, String post, String Type) {
        super(Name, Address, Nic, Contact);
        this.position = post;
        this.type = Type;
    }

    void assignDoctorToScan() {
        System.out.println(this.getName() + "Assigned for the SCAN Machine");
    }

    String getPosition() {
        return this.position;
    }

    String getType() {
        return this.type;
    }

    void addNewTreatment(Doctor d, Patient p, String date, String time, List<Treatment> treatmentList) {
        Treatment t1 = new Treatment(d, p, date, time);
        treatmentList.add(t1);
        System.out.println("Treatement Schedule updated");
    }

    void addNewAppointment(Doctor d, Patient p, String date, String time, List<Appointment> appointmentlist) {
        Appointment a1 = new Appointment(d, p, date, time);
        appointmentlist.add(a1);
        System.out.println("Appointment was added");
    }
}






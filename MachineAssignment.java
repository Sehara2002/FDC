import java.util.List;

public class MachineAssignment {
    public Doctor doc;
    public String date;

    MachineAssignment(Doctor d1, String date){
        this.doc = d1;
        this.date = date;
    }

    void assignToMachine(Doctor doc, String date, List<MachineAssignment> newassignments){
        MachineAssignment m1 = new MachineAssignment(doc, date);
        newassignments.add(m1);
        System.out.println("Doctor successfully assigned to the machine.");
    }
}





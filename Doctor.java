import java.util.List;

public class Doctor extends Person{
    private String dob;
    private int did = 0;

    Doctor(String Name,String Address, String Nic, String Contact,String Dob){
        super(Name, Address, Nic, Contact);
        this.dob = Dob;
        this.did+=1;

    }

    int getDid(){
        return this.did;
    }

    String getDob(){
        return this.dob;
    }

    void register(String Name,String Address, String Nic, String Contact,String Dob, List<Doctor> doctors){
        Doctor d1 = new Doctor(Name, Address, Nic, Contact,Dob);
        doctors.add(d1);
        System.out.println("Doctor registered successfully with ID: "+d1.getDid());
    }

}





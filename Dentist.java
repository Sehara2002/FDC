public class Dentist extends Doctor{
    private int experience;
    Dentist(String Name, String Address, String Nic, String Contact, String Dob,int exp){
        super(Name, Address, Nic, Contact, Dob);
        this.experience = exp;
    }

    int getExp(){
        return this.experience;
    }
}



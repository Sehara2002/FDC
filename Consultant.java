public class Consultant extends Doctor {
    private String qualification;
    private String country;

    Consultant(String Name, String Address, String Nic, String Contact, String Dob, String qual, String country) {
        super(Name, Address, Nic, Contact, Dob);
        this.qualification = qual;
        this.country = country;
    }

    String getQualification() {
        return this.qualification;
    }

    String getCountry() {
        return this.country;
    }
}



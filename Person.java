public class Person {
    private String name;
    private String address;
    private String nic;
    private String contactNo;

    Person(String Name,String Address, String Nic, String Contact){
        this.name = Name;
        this.address = Address;
        this.nic = Nic;
        this.contactNo = Contact;
    }
    String getName(){
        return this.name;
    }

    String getAddress(){
        return this.address;
    }

    String getNic(){
        return this.nic;
    }

    String getContact(){
        return this.contactNo;
    }
}





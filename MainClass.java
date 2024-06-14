public class MainClass {
    public static void main(String[] args) {
        ScanMachine newMachine = ScanMachine.getMachine();
        
        newMachine.setSerial("11112222");
        newMachine.setMake("Toshiba");
        newMachine.setCountry("Japan");
        newMachine.setCost(25000);


        System.out.println("Serial Number: "+newMachine.getSerialNumber());
        System.out.println("Manufacturer : "+newMachine.getMake());
        System.out.println("Made in : "+newMachine.getCountry());
        System.out.println("Cost : "+newMachine.getCost());
    } 
}




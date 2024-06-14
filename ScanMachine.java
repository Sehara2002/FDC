public class ScanMachine {
    private static ScanMachine machine = null;
    private String serialNumber;
    private String make;
    private String OriginCountry;
    private float cost;

    private ScanMachine(){}

    public static ScanMachine getMachine(){
        if(machine == null){
            machine = new ScanMachine();
        }

        return machine;
    }

    public String getSerialNumber(){
        return this.serialNumber;
    }

    public String getMake(){
        return this.make;
    }

    public String getCountry(){
        return this.OriginCountry;
    }

    public float getCost(){
        return this.cost;
    }

    public void setSerial(String serial){
        this.serialNumber = serial;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setCountry(String country){
        this.OriginCountry = country;
    }

    public void setCost(float cost){
        this.cost = cost;
    }


}




package Activity_01;

public class Dog extends Animal{
    public String breed;
    public String owner;
    Dog(String name, int age, String gender,String breed, String owner){
        super(name, age, gender);
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    void eat(){
        System.out.println("The dog is eating");
    }

}









package Activity_01;

public class Animal {
    String name;
    int age;
    String gender;

    Animal(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void eat(){
        System.out.println("Animal is eating");
    }
   
    void eat(String meal){
        System.out.println("Animal is eating "+meal);
    }
}




package Activity_01;

import java.util.ArrayList;
import java.util.List;

public class ClassSchool {
    public String schoolNumber;
    public String schoolAddress;
    public List<ClassRoom> rooms;

    ClassSchool(String schoolNumber, String address){
        this.schoolNumber = schoolNumber;
        this.schoolAddress = address;
        this.rooms = new ArrayList<>();
    }

    void addroom(ClassRoom room){
        rooms.add(room);
    }

    void showRooms(){
        for(ClassRoom room:rooms){
            room.showRoom();
        }
    }
    void displayAddress(){
        System.out.println("The school address is "+this.schoolAddress);
    }
}



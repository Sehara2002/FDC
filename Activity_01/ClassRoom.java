package Activity_01;

public class ClassRoom {
    public int roomNo;
    public float Area;
    public int count;

    ClassRoom(int roomNo, float area, int countn){
        this.roomNo = roomNo;
        this.Area = area;
        this.count = countn;
    }

    void showRoom(){
        System.out.println("Room Number: "+this.roomNo);
        System.out.println("Room Area in sqr Feets: "+this.Area);
        System.out.println("Room Member Count: "+this.count);
    }
}





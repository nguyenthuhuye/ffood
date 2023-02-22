//3.1 Write a program to create a room class,
// the attributes of this class is roomno, roomtype, roomarea and ACmachine.
// In this class the member functions are setdata and displaydata.

public class b31 {
    int roomNo;
    String roomType;
    float roomArea;
    boolean acMachine;
    void setData(int rno, String rt, float area, boolean ac) {
        roomNo = rno;
        roomType = rt;
        roomArea = area;
        acMachine = ac;
    }
    void displayData() {
        System.out.println("The room#.Is" + roomNo);
        System.out.println("The room Type is" + roomType);
        System.out.println("The room area is" + roomArea);
        String s = (acMachine) ? "yes" : "no";
        System.out.println("The A / c Machine needed" + s);
    }
    public static void main(String arg[]) {
        b31 b311 = new b31();
        b311.setData(101, "Deluxe", 240.0f, true);
        b311.displayData();
    }
}

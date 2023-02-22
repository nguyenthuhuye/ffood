//3.2 Write a program create a class 'simpleobject'. Using constructor display the message.

public class Simpleobject {
    Simpleobject() {
        System.out.println("No argument Constructor");
    }
    Simpleobject(int a) {
        System.out.println("One argument Constructor");
    }
}
class Constructor {
    public static void main(String arg[]) {
        new Simpleobject();
        new Simpleobject(100);
    }
}

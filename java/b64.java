//6.4 Write a program to create interface named test. In this interface the member function is square.
// Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use the object of arithmetic class.
class Outer {
    void display() {
        System.out.println("Outer display method called");
    }

    class Inner {
        void display() {
            System.out.println("Inner display method called");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.display();

        Outer.Inner obj2 = obj1.new Inner();
        obj2.display();
    }
}


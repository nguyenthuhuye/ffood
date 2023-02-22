//3.4 Write a program to give the example for 'this' operator. And also use the 'this' keyword as return statement.

public class b34 {
    int a;
    int b;
    // Parameterized constructor
    b34(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    //Default constructor
    b34()
    {
        a = 10;
        b = 20;
    }
    //Method that returns current class instance
    b34 get()
    {
        return this;
    }
    //Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args)
    {
        //refer current class instance variables

        b34 object = new b34(10, 20);
        object.display();

        //to return the current class instance

        b34 object1 = new b34();
        object1.get().display();
    }

}

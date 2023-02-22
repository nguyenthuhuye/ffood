/* Write a program to create interface named test. In this interface the member function is square.
Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use the object of arithmetic class. */

interface Test {
    int square(int num);
}

class Arithmetic implements Test {
    public int square(int num) {
        return num * num;
    }
}

class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        int result = obj.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}

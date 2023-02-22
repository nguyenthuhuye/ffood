//10.5 Write a program to describe usage of throws clause.

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            // Call the method that throws an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

//10.4 Write a program to illustrate usage of try/catch with finally clause.

public class TryCatchFinallyExample {

    public static void main(String[] args) {
        try {
            // Some code that may throw exceptions
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}


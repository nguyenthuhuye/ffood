//10.2 Write a program for example of multiple catch statements occurring in a program.
public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            // Some code that may throw exceptions
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
}

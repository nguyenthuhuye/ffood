//10.6 Write a program for creation of user defined exception.

public class UserDefinedExceptionExample {

    public static void main(String[] args) {
        try {
            // Some code that may throw a custom exception
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

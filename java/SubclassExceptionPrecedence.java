//10.3 Write a program to illustrate sub class exception precedence over base class.

public class SubclassExceptionPrecedence {

    public static void main(String[] args) {
        try {
            // Some code that may throw exceptions
            throw new SubclassException();
        } catch (SubclassException e) {
            System.out.println("Caught SubclassException");
        } catch (BaseClassException e) {
            System.out.println("Caught BaseClassException");
        }
    }
}

class BaseClassException extends Exception {
}

class SubclassException extends BaseClassException {
}


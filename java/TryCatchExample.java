//10.1 Write a program for example of try and catch block. In this check whether the given array size is negative or not.

public class TryCatchExample {

    public static void main(String[] args) {
        int size = -5;

        try {
            int[] arr = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
    }
}

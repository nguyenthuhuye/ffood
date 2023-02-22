//1.3 Write a program check two strings are equal or not.
import java.util.*;

public class b13 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String string1 = in.nextLine();
        System.out.println("Enter the first string: "
                + string1);

        String string2 = in.nextLine();
        System.out.println("Enter the second string :"
                + string2);

        System.out.println("\nAre both strings same: ");

        if (string1.equals(string2) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

//12.2 Write a program to accept specified number of characters as input and converts them into uppercase characters.

import java.util.Scanner;

public class UppercaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of characters to convert to uppercase: ");
        int numChars = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Enter the characters: ");
        String input = scanner.nextLine();

        String output = input.substring(0, numChars).toUpperCase();
        System.out.println("Uppercase output: " + output);
    }
}

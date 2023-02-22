//12.3 Write a program to get the input from the user and store it into file. Using Reader and Writer file.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputOutputExample {
    public static void main(String[] args) {
        try {
            // create a BufferedReader to read input from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // prompt the user to enter some text
            System.out.print("Enter some text: ");
            String input = reader.readLine();

            // create a BufferedWriter to write to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            // write the user input to the file
            writer.write(input);

            // close the writer
            writer.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


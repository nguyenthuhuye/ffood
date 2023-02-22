//12.1 Write a program to create a file and write data into it using the methods OutputStream class.
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputExample {

    public static void main(String[] args) {
        String filename = "output.txt";
        String content = "This is some text that we will write to the file.";

        try (OutputStream os = new FileOutputStream(filename)) {
            byte[] data = content.getBytes();
            os.write(data);
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}


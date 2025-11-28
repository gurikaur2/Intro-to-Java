/* Write a program to perform simple read and write operation into file. */

package EXP9.Q3;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadWrite {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Specify the file path here

        // Write to the file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, this is a sample text file.\n");
            writer.write("This file is used to demonstrate read and write operations in Java.");
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read from the file
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            System.out.println("Reading data from the file:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
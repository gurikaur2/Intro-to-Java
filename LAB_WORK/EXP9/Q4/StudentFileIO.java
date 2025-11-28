/* Write a program that writes an Serial No.(int), First Name (String), CGPA (float) and  Grade(char)
 into a text file using bufferedWriter and displays the contents using bufferedReader. */

package EXP9.Q4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class StudentFileIO {
    public static void main(String[] args) {
        String filePath = "student.txt"; // Specify the file path here

        // Writing data to the file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Serial No: 1\n");
            writer.write("First Name: John\n");
            writer.write("CGPA: 3.8\n");
            writer.write("Grade: A\n");
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading data from the file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading data from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}

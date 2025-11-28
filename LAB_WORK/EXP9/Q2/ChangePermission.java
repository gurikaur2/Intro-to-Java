/* Write a program to change the file permissions */

package EXP9.Q2;
import java.io.File;
public class ChangePermission {
    public static void main(String[] args) {
        File file = new File("test.txt"); // Specify the file path here

        // Change file permissions
        boolean canRead = file.setReadable(true);
        boolean canWrite = file.setWritable(false);
        boolean canExecute = file.setExecutable(true);

        // Display the results
        System.out.println("File Permissions Changed:");
        System.out.println("Readable: " + canRead);
        System.out.println("Writable: " + canWrite);
        System.out.println("Executable: " + canExecute);
    }
}
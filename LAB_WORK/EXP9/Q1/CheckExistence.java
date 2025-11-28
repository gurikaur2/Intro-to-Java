/* Write a program to check if the file exist is a file or directory */

package EXP9.Q1;
import java.io.File;
public class CheckExistence {
    public static void main(String[] args) {
        File file = new File("test.txt"); // Specify the file or directory path here

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(file.getName() + " is a file.");
            } else if (file.isDirectory()) {
                System.out.println(file.getName() + " is a directory.");
            }
        } else {
            System.out.println(file.getName() + " does not exist.");
        }
    }
}

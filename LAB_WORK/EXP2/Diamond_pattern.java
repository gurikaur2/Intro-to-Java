
/* Write a Java program to display the character rhombus structure. You can assume a character to create rhombus/diamond, left and right triangle, pyramid.  
 Definition of Done: 
DoD1: The program asks the user for the number of rows for the rhombus structure from the user 
DoD 2: After a successful run, the program should ask the user if he wants to try the program for some other value, and should exit only when the user wants to exit (by pressing the character ‘N’).
 */
import java.util.*;
public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = '*'; // Character to use for the pattern
        char choice;

        do {
            System.out.print("Enter the number of rows for the rhombus structure: ");
            int rows = scan.nextInt();

            // Upper half of the diamond
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
                // Print characters
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(ch);
                }
                System.out.println();
            }

            // Lower half of the diamond
            for (int i = rows - 1; i >= 1; i--) {
                // Print leading spaces
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
                // Print characters
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(ch);
                }
                System.out.println();
            }

            System.out.print("Do you want to try for another value? (Press 'N' to exit): ");
            choice = scan.next().charAt(0);
        } while (Character.toUpperCase(choice) != 'N');

        System.out.println("Program exited.");
    }
}

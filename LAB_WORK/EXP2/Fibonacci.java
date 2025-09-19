/* Write a Java program to generate and display the Fibonacci series up to n terms using control statements:
Definition of Done (DoD):
•	DoD 1: The program should ask the user to enter the number of terms (n).
•	DoD 2: The program should use only loops/conditionals to generate the series (no functions).
•	DoD 3: The program should display the series in proper format.
 */
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scan.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first);
            if (i < n) {
                System.out.print(", ");
            }
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}

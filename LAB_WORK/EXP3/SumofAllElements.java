/* Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
i) Sum of all the elements
ii) Sum of alternate elements in the array.
Definition of Done
DoD 1: The program should ask the user to enter the elements of the array.
DoD 2: The program should display a menu with the above choices and ask the user to choose one of the choices.
 */
import java.util.*;
public class SumofAllElements {  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Menu:");
        System.out.println("1. Sum of all elements");
        System.out.println("2. Sum of alternate elements");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                int totalSum = 0;
                for (int num : arr) {
                    totalSum += num;
                }
                System.out.println("Sum of all elements: " + totalSum);
                break;
            case 2:
                int alternateSum = 0;
                for (int i = 0; i < n; i += 2) {
                    alternateSum += arr[i];
                }
                System.out.println("Sum of alternate elements: " + alternateSum);
                break;
            default:
                System.out.println("Invalid choice. Please choose either 1 or 2.");
        }
    }
}
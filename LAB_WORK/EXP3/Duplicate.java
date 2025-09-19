/* Write a Java program to read numbers in an integer array of size 5 and remove duplicate elements from the array.
Definition of Done (DoD):
DoD 1: The program should ask the user to enter the elements of the array.
DoD 2: The program should display the array after removing duplicates.
 */

import java.util.*;
public class Duplicate {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Using a LinkedHashSet to maintain insertion order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
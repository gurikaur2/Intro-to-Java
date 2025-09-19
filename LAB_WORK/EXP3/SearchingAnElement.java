/*  Write a Java program to find the index of an array element in an array of size n. The program should not use any function other than main ( ) functions.
Definition of Done:
DoD 1: The program should ask the user to enter the elements of the array.
DoD 2: The program should ask the user to enter a number to search.
DoD 3: The program should display the elements of the array entered.
DoD 4: The program should display the index of the number if the item is present or display -1 of the element is not present.
 */

import java.util.*;
public class SearchingAnElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = scan.nextInt();

        System.out.println("Elements of the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found. Index: -1");
        }
    }
}
/* Write a Java Program to count even and odd numbers in an array.
Definition of Done
DoD 1: The program should ask the user to enter the elements of the array.
DoD 2:  Even elements will be stored in EvenArray[] and odd elements will be stored in oddArray[].
DoD 3: Display all three arrays along with their length.
 */

import java.util.*;
public class CountOddorEven {   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int eIndex = 0, oIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenArray[eIndex++] = num;
            } else {
                oddArray[oIndex++] = num;
            }
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Even Array: " + Arrays.toString(evenArray) + " | Length: " + evenArray.length);
        System.out.println("Odd Array: " + Arrays.toString(oddArray) + " | Length: " + oddArray.length);
    }
}

//recursive method to calculate sum of digits by taking input from user

import java.util.Scanner;

class Recursive_sum {
    static int sumOfDigits(int n) {
        //base case
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int result = sumOfDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + result);
    }
}

import java.util.Scanner;

class Recursion {
    int num;
    String str;

    // Non-parameterized constructor
    Recursion() {
        this.num = 0;
        this.str = "";
    }

    // Parameterized constructor
    Recursion(int num, String str) {
        this.num = num;
        this.str = str;
    }

    // Recursive Fibonacci printer
    void fibonacci(int n) {
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    private int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Recursive factorial
    int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Recursive palindrome check
    boolean palindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    // Recursive reverse
    String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}

public class RecursionProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create objects
        Recursion obj1 = new Recursion();
        System.out.print("Enter an integer for parameterized object: ");
        int userInt = scan.nextInt();
        scan.nextLine(); // consume newline
        System.out.print("Enter a string for parameterized object: ");
        String userStr = scan.nextLine();
        Recursion obj2 = new Recursion(userInt, userStr);

        Recursion currentObj;
        while (true) {
            System.out.println("\nChoose object:");
            System.out.println("1. Non-parameterized");
            System.out.println("2. Parameterized");
            System.out.println("3. Exit");
            int objChoice = scan.nextInt();
            scan.nextLine(); // consume newline

            if (objChoice == 3) break;
            currentObj = (objChoice == 1) ? obj1 : obj2;

            System.out.println("\nMenu:");
            System.out.println("1. Fibonacci");
            System.out.println("2. Factorial");
            System.out.println("3. Palindrome");
            System.out.println("4. Reverse");
            System.out.println("5. Exit");
            int choice = scan.nextInt();
            scan.nextLine(); // consume newline

            if (choice == 5) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter number of terms: ");
                    int n = scan.nextInt();
                    scan.nextLine();
                    currentObj.fibonacci(n);
                    break;
                case 2:
                    System.out.print("Enter number to find factorial: ");
                    int f = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Factorial of " + f + " is: " + currentObj.factorial(f));
                    break;
                case 3:
                    System.out.print("Enter string to check palindrome: ");
                    String p = scan.nextLine();
                    boolean isPal = currentObj.palindrome(p);
                    System.out.println(p + (isPal ? " is a palindrome." : " is not a palindrome."));
                    break;
                case 4:
                    System.out.println("Enter string to reverse: ");
                    String r = scan.nextLine();
                    System.out.println("Reverse: " + currentObj.reverse(r));
                    break;
                    default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Program exited.");
    }
}

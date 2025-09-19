
public class PrimeorNot {
    public static void main(String[] args) {
        int num, i, count = 0;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not:");
        num = scan.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

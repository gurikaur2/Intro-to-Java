package LAB_WORK.EXP3;
public class CountOddorEven {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}

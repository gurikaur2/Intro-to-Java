package LAB_WORK.EXP3;
public class SumofAltElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
        }
        System.out.println("Sum of alternate elements: " + sum);
    }
}

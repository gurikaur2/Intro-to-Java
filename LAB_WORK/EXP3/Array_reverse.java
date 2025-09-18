package LAB_WORK.EXP3;
public class Array_reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        // Reversing the array
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        
        System.out.println("\nReversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

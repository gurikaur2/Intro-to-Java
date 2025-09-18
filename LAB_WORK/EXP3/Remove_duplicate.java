package LAB_WORK.EXP3;

public class Remove_duplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        java.util.Set<Integer> uniqueNumbers = new java.util.HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }
        System.out.println("Array after removing duplicates: " + uniqueNumbers);
    }
}

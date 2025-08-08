import java.util.*;

class Array_Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter length of array:");
        int length = scan.nextInt(); 
        
        int arr[] = new int[length];
        
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < length; i++) { 
            arr[i] = scan.nextInt();
        }
        
        System.out.println("Final array: " + Arrays.toString(arr));

        int sum=0;
        
    }
}

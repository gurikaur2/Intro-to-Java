public class CommandLineDemo {
    public static void main(String[] args) {
        //check if length of args array is greater than 0
        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        int sum = num1 +num2;
        System.out.println("Sum is: "+sum);

    }
}

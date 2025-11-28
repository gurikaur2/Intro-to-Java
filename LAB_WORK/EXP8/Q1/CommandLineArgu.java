/* 1.	Write a program that takes 5 integer command line arguments. Create a user defined Exception named CheckArgumentException to check the number of arguments passed through command line. If the number of arguments is less than five, throw the CheckArgumentException, else print the addition of all five numbers.

Definition of Done:

DOD 1:Create a user-defined exception by the name CheckArgumentException
DOD 2:Ask the user to enter the number of arguments
DOD 3:Use for loop to enter the arguments
DOD 4: Calculate the sum of the values entered
 */

package EXP8.Q1;
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
public class CommandLineArgu {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Insufficient arguments. Please provide exactly 5 integers.");
            } else {
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += Integer.parseInt(args[i]);
                }
                System.out.println("The sum of the entered integers is: " + sum);
            }
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please ensure all arguments are integers.");
        }
    }
}



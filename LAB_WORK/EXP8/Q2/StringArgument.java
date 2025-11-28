/* Create a class with a main() method that throws an object of class Exception inside a try block. 
Give the constructor for Exception a String argument. Catch the exception inside a catch clause and 
print the String argument. Add a finally clause and print a message to prove you were there.
 */

package EXP8.Q2;
public class StringArgument {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception message.");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

/* Create your own exception class using the extends keyword. Write a    constructor for this class that takes a String argument and stores it inside the object with a String reference. Write a method that prints out the stored String. Create a try-catch clause to exercise your new exception.

     Definition of Done:
1.  	Accept a string argument
2.  	Create a separate function to print the string.
 */

package EXP8.Q4;
class MyCustomException extends Exception {
    private String message;

    public MyCustomException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Exception Message: " + message);
    }
}
public class ExtendsKeyword {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception message.");
        } catch (MyCustomException e) {
            e.printMessage();
        }
    }
}

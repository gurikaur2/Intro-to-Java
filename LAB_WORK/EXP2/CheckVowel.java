/* Write a Java program that asks the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
Definition of Done:
DoD 1: The program asks an input from the user.
DoD 2: A single character input is taken from the user or an error message is
generated.
DoD 3: The program should print “Vowel” if the entered character is a vowel and
“Consonant” if the entered character is a consonant.
 */
import java.util.*;

class CheckVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a single alphabet character: ");
        String input = scan.nextLine();

        // Check for single character and if it's a letter
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet character (A-Z or a-z).");
            return;
        }

        char alphabet = Character.toLowerCase(input.charAt(0));
        //Check for vowel or consonant
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
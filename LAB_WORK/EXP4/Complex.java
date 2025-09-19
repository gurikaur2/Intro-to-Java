/* . Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.
 */
public class Complex {
    int real1 = 3, imag1 = 2; // First complex number: 3 + 2i
    int real2 = 1, imag2 = 7; // Second complex number: 1 + 7i

    public static void main(String[] args) {
        Complex num = new Complex();

        // Sum
        int sumReal = num.real1 + num.real2;
        int sumImag = num.imag1 + num.imag2;
        System.out.println("Sum: " + sumReal + " + " + sumImag + "i");

        // Difference
        int diffReal = num.real1 - num.real2;
        int diffImag = num.imag1 - num.imag2;
        System.out.println("Difference: " + diffReal + " + " + diffImag + "i");

        // Product
        int prodReal = (num.real1 * num.real2) - (num.imag1 * num.imag2);
        int prodImag = (num.real1 * num.imag2) + (num.imag1 * num.real2);
        System.out.println("Product: " + prodReal + " + " + prodImag + "i");
    }
}

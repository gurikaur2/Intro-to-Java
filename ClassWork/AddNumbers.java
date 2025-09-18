package ClassWork;
import java.util.Scanner;

class AddNumbers
{
	public static void main (String args[])
	{
	int a,b,rem;
	System.out.println("Enter two numbers:");
	Scanner scan = new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	/*sum=a+b;
	System.out.println("Sum of a and b = " + sum + " Program End.");*/

	/*diff = a-b;
	System.out.println("Difference of a and b = " + diff+ " Program End.");*/

	/*prod = a*b;
	System.out.println("Product of a and b = " + prod+ " Program End.");*/

	/*quotient=a/b;
	System.out.println("Quotient of a and b = " + quotient+ " Program End.");*/

	rem=a%b;
	System.out.println("Remainder of a and b = " + rem+ " Program End.");
	}
}
import java.util.Scanner;

class Calc_char
{
	public static void main (String args[])
	{
		int n1, n2, sum,diff,quotient,rem;
		char choice;
		System.out.println("A : Addition");
		System.out.println("B : Difference");
		System.out.println("C : Multiplication");
		System.out.println("D : Division");
		System.out.println("E : Modulo");
		System.out.println("Enter your choice:");

		Scanner scan = new Scanner (System.in);
		choice = scan.next().charAt(0);
		System.out.println("Enter two numbers:");
		n1=scan.nextInt();
		n2=scan.nextInt();

		if (choice=='A')
		{
			sum=a+b;
			System.out.println("Sum= "+ sum);
		}
		else if(choice =='B')
		{
			diff=a-b;
			System.out.println("Difference = "+ diff);
		}
		else if(choice =='C')
		{
			prod=a*b;
			System.out.println("Product="+prod);
		}
		else if (choice=='D') {
			quotient=a/b;
			System.out.println("Quotient="+quotient);
		}
		else if (choice=='E') {
			rem=a%b;
			System.out.println("Remainder="+ rem);
		}
	}
}
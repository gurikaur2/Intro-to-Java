import java.util.Scanner;

class Calc
{
	public static void main(String args[])
	{
		int a,b,sum,diff,prod,quotient,rem;
		int choice;
		System.out.println("1 : Addition");
		System.out.println("2 : Difference");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		System.out.println("5 : Modulo");
		System.out.println("Enter your choice:");

		Scanner scan = new Scanner (System.in);
		choice = scan.nextInt();
		System.out.println("Enter two numbers:");
		a=scan.nextInt();
		b=scan.nextInt();

            switch (choice) {
                case 1:
                    sum=a+b;
                    System.out.println("Sum= "+ sum);
                    break;
                case 2:
                    diff=a-b;
                    System.out.println("Difference = "+ diff);
                    break;
                case 3:
                    prod=a*b;
                    System.out.println("Product="+prod);
                    break;
                case 4:
                    quotient=a/b;
                    System.out.println("Quotient="+quotient);
                    break;
                case 5:
                    rem=a%b;
                    System.out.println("Remainder="+ rem);
                    break;
                default:
                    break;
            }

	}
}
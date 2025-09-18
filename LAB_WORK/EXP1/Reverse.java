import java.util.Scanner;

class Reverse{
	public static void main(String[] args)
	{
		int num, reversed =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to be reversed:");
		num=scan.nextInt();
		for (int i =0;i<3 ;i++ ) {
			int y = num %10;
			reversed=reversed *10 +y;
			num/=10;
		}
		System.out.println("Reversed number=" +reversed);
	}
}
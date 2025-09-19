import java.util.Scanner;

class Sum_three
{
	public static void main (String args[])
	{
		int num,sum=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a 3 digit number:");
		num = scan.nextInt();
		for(int i =0;i<3;i++)
		{
			int x = num%10;
			sum=sum+x;
			num=num/10;
		}
		System.out.println("Sum of 3 digits are: "+sum);
	}
		}

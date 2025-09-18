import java.util.Scanner;

class Twos_table
{
	public static void main(String[] args)
	{
		int  n;
		Scanner scan = new Scanner (System.in);

		System.out.println("Enter number:");
		n=scan.nextInt();
		for (int i=1;i<=20 ;i++ ) {
			System.out.println(n + " x "+ i+"="+n*i);

		}





		/*for (int i =1;i<=20 ;i++ ) {
			System.out.println("2 x " +i+"="+2*i);
		}*/
		
		/*int i=1;
		while (i<=20)
		{
			System.out.println("2 x "+i+"="+2*i);
			i++;
		}*/

		/*int n=1;
		do
		{
			System.out.println("2 x "+n+"="+2*n);
			n++;

		}while(n<=20);*/



	}
}

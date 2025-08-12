import java.util.Scanner;

class Temperature
{
	public static void main(String args[])
	{
		float celsius, fahrenheit;
		System.out.println("Enter temp in celsius:");
		Scanner scan=new Scanner (System.in);
		celsius=scan.nextFloat();
		fahrenheit=celsius*(9.0f/5)+32;
		System.out.println("Temperature in fahrenheit=" + fahrenheit);


	}
}
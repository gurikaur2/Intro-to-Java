import java.util.Scanner;

class Min_conversion
{
	public static void main (String args[])
	{
		long minutes;
		float years, days;
		System.out.println("Enter number of minutes:");
		Scanner scan = new Scanner(System.in);
		minutes=scan.nextLong();
		years= minutes/(365*24*60);
		days=minutes/(60*24)%365;
		System.out.println("Years=" + years);
		System.out.println("Days="+days);
	}
}
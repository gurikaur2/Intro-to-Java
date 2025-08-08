import java.util.*;

class CheckVowel{
	public static void main(String[] args)
	{
		char alphabet;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an alphabet to determine whether it is a vowel or a consonant:");
		//alphabet=scan.next().charAt(0);

	//If the input is upper case
		alphabet= scan.next().toLowerCase().charAt(0);
		switch(alphabet)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is vowel!");
			break;

		default:
			System.out.println("It is a consonant!");

		}


	}
}
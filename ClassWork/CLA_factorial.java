//use command line arguments to accept a number and print its factorial

class CLA_factorial 
{
    public static void main(String[] args) 
    {
        int num = Integer.parseInt(args[0]);
        int fact = 1;
        for(int i = 1; i <= num; i++) 
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
import java.util.Scanner;

public class checkNumbers
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int yourNumber = scan.nextInt();
		
		if(yourNumber % 2 == 0)
		{
			System.out.println(yourNumber + " is Even");
		}
		else
		{
			System.out.println(yourNumber + " is Odd");
		}
	}
}
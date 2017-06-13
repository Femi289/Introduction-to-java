import java.util.Scanner;

public class ControlledSwitch
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter multiples of 5 less than 25");
		int start = input.nextInt();
		
		switch(start)
		{
			case 20:
			
			break;
			case 15:
			
			break;
			case 10:
			
			break;
			case 5:
			
			break;
			default:
			System.out.println("Not a valid entry");
			break;
		}
	}
}
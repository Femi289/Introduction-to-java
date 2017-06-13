import java.util.Scanner;

public class WhileNumbers
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
				
		int yourAge = scan.nextInt();
		
		while(yourAge < 18)
		{
			System.out.println("Do you want to continue? yes or no");
			String conditionFactor = scan.nextLine();
			if(conditionFactor.equals("no"))
				break;
			
			System.out.println("you are way too young for this");
			//yourAge++;
		}
		
	}
}
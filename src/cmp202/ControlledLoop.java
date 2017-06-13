import java.util.Scanner;

public class ControlledLoop
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Where do you want to start");
		int start = input.nextInt();
		
		System.out.println("Where do you want to end");
		int end = input.nextInt();
		
		if(start < end){
			for(int i = start; i < end; i++)
			{
				System.out.println(i);
			}
		}
		else
		{
			System.out.println("Start should be less than end");
		}
	}
}
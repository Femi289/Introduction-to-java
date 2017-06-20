package cmp202;


import java.util.Scanner;

public class DoWhileNumbers
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
				
		int yourAge = scan.nextInt();
		
		do{
			yourAge++;
			System.out.println(yourAge);
		}
		
		while(yourAge < 18);	
	}
}

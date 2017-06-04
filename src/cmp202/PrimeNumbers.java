/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cmp202;

import java.util.Scanner;

/**
 *
 * @author Barka
 */
public class PrimeNumbers {
    
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find if it is a prime number");
        
        int userInput = sc.nextInt();
        int cap = userInput / 2;
        boolean isPrime = true;
        
        if(userInput == 2 || userInput == 3)
        {
            isPrime = true;
            System.out.println(userInput + " is not a prime number");
        }
        if((userInput % 2) == 0)
        {
            isPrime = false;
            System.out.println(userInput + " is a prime number");
        }
            
        int rootOfInput = (int)Math.sqrt(userInput) + 1;
        for(int i = 3; i < rootOfInput; i++) 
        {
            if((userInput % i) == 0)
            {
                isPrime = false;
                System.out.println(userInput + " is not a prime number");
                break;
            }
            else
            {
                System.out.println(userInput + " is a prime number");
            }
        }
        //System.out.println(userInput + " is a prime number");
    }
}
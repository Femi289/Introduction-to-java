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
public class EvenOrOdd {
    
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to find if its odd or even");
        int userInput = sc.nextInt();
        
        if(userInput % 2 == 0)
        {
            System.out.println(userInput+" is an even number");
        }
        else
        {
            System.out.println(userInput+" is an odd number");
        }
    }
    
}

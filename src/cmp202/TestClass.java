/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cmp202;

/**
 *
 * @author Barka
 */
public class TestClass {
    //Variable declaration
    static double velocity;
    static double distance, time;
	
	//Main method runs our code
	public static void main(String [] args)
	{
		System.out.println("Hello world again");
                
                calculateVelocity();
                calculateDistance();
	}
	
	//calculate velocity
	public static int calculateVelocity()
	{
		distance = 24.5;
		time = 70.897;
		
		velocity = distance/time;
		
		System.out.println("Velocity is: "+velocity);
		return 0;
	}
	
	public static void calculateDistance()
	{
		time = 70.897;
		velocity = 23.77989;
		
		distance = time * velocity;
		System.out.println(distance);
	}
}

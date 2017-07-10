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

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;

public class ExecuteFormulas {
    
    public static void main(String [] args)
    {
        Formulas myFormula = new Formulas();
        
        Scanner sc = new Scanner(System.in);
        JOptionPane.showInputDialog("Enter X");
        
        try{
        float distance = sc.nextFloat();
        float force = sc.nextFloat();
        
        float myKinetic = myFormula.calcKineticEnergy(34.5f, 45.78f);
        float work = myFormula.calculateWork(distance, force);
        
        System.out.println(work);
        System.out.println(myKinetic);
        }
        catch(InputMismatchException iME)
        {
            JOptionPane.showMessageDialog(null, "Wrong input type");
                    
        }
    }
}

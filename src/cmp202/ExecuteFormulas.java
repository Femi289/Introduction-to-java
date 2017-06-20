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
public class ExecuteFormulas {
    
    public static void main(String [] args)
    {
        Formulas myFormula = new Formulas();
        
        float myKinetic = myFormula.calcKineticEnergy(34.5f, 45.78f);
        float work = myFormula.calculateWork(34.5f, 45.78f);
        
        System.out.println(work);
        System.out.println(myKinetic);
    }
}

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
public class Formulas {
    
    public float calculateWork(float force, float distance)
    {
     return force*distance;
    }
    
    public float calcKineticEnergy(float m, float v)
    {
        //float kineticResult =(1/2)*m*v*v;
        //System.out.println(kineticResult);
        return (1/2)*(m*v*v);
    }
    
    public float calcVolumeOfCylinder(float r, float h)
    {
        float volume = (22/7)*r*r*h;
        return volume;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicalinstrumentapp;

/**
 *
 * @author Paul
 */
public class Guitar extends Instrument
{
    public String modelName;
    
    protected void play()
    {
        System.out.println(modelName + ": Strum, strum, pluck, pluck...");
    }
}

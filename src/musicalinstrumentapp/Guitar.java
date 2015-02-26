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
    @Override
    protected void play()
    {
        System.out.println(modelName + ": Strum, strum, pluck, pluck...");
    }
    
    @Override
    protected void lift()
    {
        System.out.println(modelName + ": You comfortably pick up the instrument.");
    }
    
    protected void attachCapo()
    {
        System.out.println(modelName + ": You can now strum open chords in a higher key.");
    }
    
    protected void slide()
    {
        System.out.println(modelName + ": Bwaaannnng! Nice slide, very rock n' roll.");
    }
}

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
public class Instrument
{
    protected String modelName = "Musical Instrument";
    
    protected void play()
    {
        System.out.println(modelName + ": 'That's a pleasant melody, but what instrument is that?'");
    }
    
    protected void purchase()
    {
        System.out.println(modelName + ": 'That generic instrument wasn't too expensive or too cheap.'");
    }
    
    protected void lift()
    {
        System.out.println(modelName + ": 'This instrument isn't too heavy or too light.'");
    }
    
    protected void setModelName()
    {
        
    }
}

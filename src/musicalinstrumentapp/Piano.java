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
public class Piano extends Instrument
{
    @Override
    protected void play()
    {
        System.out.println(modelName + ": Plink, plink, plink...");
    }
}

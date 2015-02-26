
package musicalinstrumentapp;

/**
 *
 * @author Paul
 * The piano class is a subclass of Instrument. It contains methods play() and
 * lift() in altered overridden versions. It also contains the additional
 * methods pressSustainPedal() and glissando(), actions unique to the piano.
 */
public class Piano extends Instrument
{
    @Override
    protected void play()
    {
        System.out.println(modelName + ": Plink, plink, plink...");
    }
    
    @Override
    protected void lift()
    {
        System.out.println(modelName + ": This instrument is much too heavy. Better hire some movers.");
    }
    
    protected void pressSustainPedal()
    {
        System.out.println(modelName + ": The sound rings throughout the room with the sustain pedal engaged.");
    }
    
    protected void glissando()
    {
        System.out.println(modelName + ": Chuuuululululu! Nice glissando, you're a regular Elton John.");
    }
}

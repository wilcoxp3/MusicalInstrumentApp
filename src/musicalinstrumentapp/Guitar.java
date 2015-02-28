package musicalinstrumentapp;

/**
 *
 * @author Paul
 * The guitar class is a subclass of Instrument. It contains methods play() and
 * lift() in altered overridden versions. It also contains the additional
 * methods attachCapo() and slide(), actions unique to the guitar.
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

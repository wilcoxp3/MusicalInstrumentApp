package musicalinstrumentapp;

/**
 *
 * @author Paul
 * The Instrument class serves as a superclass for more specific musical
 * instrument classes. It contains one field, modelName, to store the specific
 * model of instrument. It has three methods: play() for playing the instrument,
 * lift() for lifting the instrument, and setModelName(String modelName) for
 * naming the model of instrument.
 */
public class Instrument
{
    protected String modelName;
 
    protected void play()
    {
        System.out.println(modelName + ": That's a pleasant melody, but what instrument is that?");
    }

    protected void lift()
    {
        System.out.println(modelName + ": This instrument isn't too heavy or too light.");
    }
    
    protected void setModelName(String modelName)
    {
        this.modelName = modelName;
    }
}

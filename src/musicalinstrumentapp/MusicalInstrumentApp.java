/*
 * Workbook Project Handout 2
 * Professor: Tedd Sperling
 * Course: Introduction to JAVA - (22150)
 * Student: Paul Wilcox
 * This program creates a Piano object and a Guitar object, assigns each a
 * modelName using the Instrument class's setModelName() method, and calls all
 * 4 methods for each object.
*/
package musicalinstrumentapp;

public class MusicalInstrumentApp
{
    public static void main(String[] args)
    {
        System.out.println("-----Piano-----");
        Piano yamahaUpright = new Piano();
        yamahaUpright.setModelName("Yamaha Upright Piano");
        yamahaUpright.play();
        yamahaUpright.lift();
        yamahaUpright.pressSustainPedal();
        yamahaUpright.glissando();
        System.out.println();
        
        System.out.println("-----Guitar-----");
        Guitar alvarezAcoustic = new Guitar();
        alvarezAcoustic.setModelName("Alvarez Acoustic Guitar");
        alvarezAcoustic.play();
        alvarezAcoustic.lift();
        alvarezAcoustic.attachCapo();
        alvarezAcoustic.slide();
        
        System.out.println("\nDONE");
    }
}
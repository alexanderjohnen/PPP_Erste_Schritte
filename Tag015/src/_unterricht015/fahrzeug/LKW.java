package _unterricht015.fahrzeug;

import _unterricht015.werkstatt.Wartbar;

public class LKW extends Fahrzeug implements Wartbar
{

    private int ladekapazitaet;

    public LKW(String modell, String kennzeichen, int ladekapazitaet)
    {
        super(modell, kennzeichen);
        this.ladekapazitaet = ladekapazitaet;
    }

    public int getLadekapazitaet()
    {
        return ladekapazitaet;
    }

    public void setLadekapazitaet(int ladekapazitaet)
    {
        this.ladekapazitaet = ladekapazitaet;
    }

    public void beladen()
    {
        System.out.println("Wird beladen!");
    }

    @Override
    public void starten()
    {
        System.out.println("Der LKW startet!");
    }

    @Override
    public void gewartetWerden()
    {
        System.out.println("Wartung des LKWS wird durchgeführt");
    }

    @Override
    public void oelwechsel()
    {
        System.out.println("Öl wird gewechselt");
    }
}

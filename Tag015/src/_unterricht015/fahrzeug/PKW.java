package _unterricht015.fahrzeug;

public class PKW extends Fahrzeug
{
    private int anzahlTueren;

    public PKW(String modell, String kennzeichen, int anzahlTueren)
    {
        super(modell, kennzeichen);
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlTueren()
    {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren)
    {
        this.anzahlTueren = anzahlTueren;
    }

    public void oeffneKofferraum()
    {
        System.out.println("Die Kofferraum Klappe wird geöffnet!");
    }

    public void starten()
    {
        System.out.println("Der PKW startet!");
    }

}
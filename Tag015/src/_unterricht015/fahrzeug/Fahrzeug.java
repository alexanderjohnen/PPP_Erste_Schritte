package _unterricht015.fahrzeug;

public class Fahrzeug
{

    private String modell;
    private String kennzeichen;

    public Fahrzeug(String modell, String kennzeichen)
    {
        this.modell = modell;
        this.kennzeichen = kennzeichen;
    }


    public String getModell()
    {
        return modell;
    }

    public String getKennzeichen()
    {
        return kennzeichen;
    }

    public void setModell(String modell)
    {
        this.modell = modell;
    }

    public void setKennzeichen(String kennzeichen)
    {
        this.kennzeichen = kennzeichen;
    }

    public void starten()
    {
        System.out.println("Das Fahrzeug startet.");
    }

}
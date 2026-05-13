package aufgabefpa0122;

public class Mantel
{
    private String material;
    private int anzahlTaschen;
    private boolean hatKnoepfe;

    //getter
    public String getMaterial ()
    {
        return material;
    }

    public int getAnzahlTaschen()
    {
        return anzahlTaschen;
    }

    public boolean getHatKnoepfe()
    {
        return hatKnoepfe;
    }

    //setter
    public void setMaterial(String material)
    {
        this.material = material;
    }

    public void setAnzahlTaschen(int anzahlTaschen)
    {
        this.anzahlTaschen = anzahlTaschen;
    }

    public void setHatKnoepfe(boolean hatKnoepfe)
    {
        this.hatKnoepfe = hatKnoepfe;
    }

//    public void toString(int i, Mantel mantelImArray)
//    {
//        System.out.println("Mantel " + i + " Material: " + mantelImArray.getMaterial() +
//                "\nMantel " + i + " Anzahl Taschen: " + mantelImArray.getAnzahlTaschen() +
//                "\nSind Knöpfe vorhanden: " + booleanToTextLX(mantelImArray.getHatKnoepfe()));
//    }

    public String toString()
    {
        return "Material: " + material + ", Taschen: " + anzahlTaschen;
    }
}

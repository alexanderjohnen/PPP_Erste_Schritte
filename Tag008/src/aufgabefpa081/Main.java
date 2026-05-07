package aufgabefpa081;

class Song
{
    private String titel;
    private int dauerSekunden;
    private String interpret;

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public int getDauerSekunden()
    {
        return dauerSekunden;
    }

    public void setDauerSekunden(int dauerSekunden)
    {
        this.dauerSekunden = dauerSekunden;
    }

    public String getInterpret()
    {
        return interpret;
    }

    public void setInterpret(String interpret)
    {
        this.interpret = interpret;
    }

    public void spielen()
    {
        int minuten = dauerSekunden / 60;
        int sekunden = dauerSekunden % 60;
        System.out.printf(" Der Song %s von %s dauert %02d:%02d Minuten. \n", titel, interpret, minuten, sekunden);
    }
}

public class Main
{
    /* Level 1
     * Erstellen Sie die Klasse "Song" mit den Attributen
     * string "titel", int "dauerSekunden", string "interpret"
     * passenden Getter und Setter für die Attribute
     * und der Methode "spielen", die auf der Konsole alle Informationen über den Song ausgibt
     * (die Dauer dabei in Minuten und Sekunden, z.B. 03:35).
     *
     * Erstellen Sie in der Main einen Song und rufen Sie die Methode auf.
     * Erstellen Sie außerdem ein UML Klassendiagramm für die Klasse "Song".
     */

    static void main(String[] args)
    {
        Song song1 = new Song();

        song1.setTitel("Out the Start");
        song1.setInterpret("Dividin Building");
        song1.setDauerSekunden(321);

        song1.spielen();
    }
}
